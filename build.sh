#!/bin/bash

# create tmp dir
mkdir .tmp

# copy all md files 
cp MCreator_Minecraft_Mod_erstellen.md .tmp/00-MCreator_Minecraft_Mod_erstellen.md
# copy and reaname all the index.md (index.md is required for website generation)
for f in */*.md; do
    # ls $f
    cp $f .tmp/$(ls $f | sed "s/\//-/g")
done

# copy all the pngs
cp jugendhackt-schrift.png .tmp/
cp */*.png .tmp/

# step into the temporal depths 
cd .tmp

# replace special containers
for f in *.md; do
    # echo "::::::file $f\n"
    ## {{<notice note überschrift hier>}} -> ::: note\n###überschrift
    ## note -> note
    sed -i -E "s/\{\{<\s*notice\s+note\s+(.*)>\}\}/::: note  \n\n### \1\n/g" $f
    ## task -> note
    sed -i -E "s/\{\{<\s*notice\s+task\s+(.*)>\}\}/::: note  \n\n### \1\n/g" $f
    ## warning -> warning
    sed -i -E "s/\{\{<\s*notice\s+warning\s+(.*)>\}\}/::: warning  \n\n### \1\n/g" $f
    ## success -> tip
    sed -i -E "s/\{\{<\s*notice\s+success\s+(.*)>\}\}/::: tip  \n\n### \1\n/g" $f
    ## {{< /notice >}} => :::
    sed -i -E "s/\{\{<\s*\/\s*notice\s*>\}\}/:::/g" $f

    
done

# convert with pandoc
pandoc *.md -o ../output.docx

# mission accomplished, leave .tmp/
cd ..

# get rid of .tmp/
rm -r .tmp