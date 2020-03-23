# Android-Studio-Animations
various android studio animations like fade,translation,rotation,scaling methods are described in the following repository \
copy activity_main.xml and MainActivity.java files and paste it in your project to get hands on experience \
while copy paste don't forget change package name
try all those transformations by changing Onclick in xml files \
this repositories contains solutions for many animation problems \

# Fade in and Fade out 
## i)alpha
alpha value ranges between 0 to 1 \
0 to make image invisible \
in between value changes visibility \
1 to make image visible 
## ii)multiple fadein and fadeout messages
bringToFront() and invalidate() are used to make multiple fade in and fade outs between 2 images

# Translation
## i)Translation up and down
to move up give negative value
to move down give positive value 
## ii)Translation up and down
to move right give negative value
to move left give positive value

# Rotation
to rotate anticlock wise use negative angles \
to rotate clockwise use positive values \
here we used currentangle variable,because if we don't use that there is a limitation that rotation can be used only once \
        instead of using currentangle variable you can use rotationBy() instead of rotation() \
        when m is an angle,to make n rotations,
          use n*m as rotating angle
# Scaling
here we used currentsizex and currentsizey variable,because if we don't use that there is a limitation that scaleX and scaleY can be used only once \
instead of using currentsizex and currentsizey variable you can use scaleXBy() and scaleYBy() instead of scaleX() and scaleY()

# Queries
App development = 70%  search + 20% experience + 10% knowledge \
if you have queries or errors use issues or type the problem in search bar along with programming language or platform \
Example: rotation animation was working only once on android studio 
