#!/bin/bash


# create tmp dir
mkdir .tmp

# copy all md files 
cp _index.md .tmp/0-MCreator_Minecraft_Mod_erstellen.md
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
    ## {{%notice note überschrift hier%}} -> ::: note\n###überschrift
    ## note -> note
    sed -i.bak -E "s/{{%[[:space:]]*notice[[:space:]]+note[[:space:]]+(.*)%}}/::: note  \n**\1**\n/g" $f
    ## task -> note
    sed -i.bak -E "s/{{%[[:space:]]*notice[[:space:]]+task[[:space:]]+(.*)%}}/::: note  \n**\1**\n/g" $f
    ## warning -> warning
    sed -i.bak -E "s/{{%[[:space:]]*notice[[:space:]]+warning[[:space:]]+(.*)%}}/::: warning  \n**\1**\n/g" $f
    ## success -> tip
    sed -i.bak -E "s/{{%[[:space:]]*notice[[:space:]]+success[[:space:]]+(.*)%}}/::: tip  \n**\1**\n/g" $f
    ## {{% /notice %}} => :::
    sed -i.bak -E "s/{{%[[:space:]]*\/[[:space:]]*notice[[:space:]]*%}}/:::/g" $f

    
done

# convert with pandoc
pandoc *.md -o ../output.docx
pandoc *.md -o "../output.pdf" --from markdown --template "../eisvogel.latex" --filter pandoc-latex-environment --listings
pandoc *.md -o "../output.epub"

# mission accomplished, leave .tmp/
cd ..

# get rid of .tmp/
rm -r .tmp
