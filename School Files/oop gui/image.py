from tkinter import *
from PIL import Image,ImageTk #pip install Pillow

root = Tk()
root.geometry("400x400")

# Add image file
image = Image.open("dotracker.png") #Load your image
image = image.resize((400,400)) #Resizing image
pic = ImageTk.PhotoImage(image) #Converting image for Tkinter to use


canvas1 = Canvas(root, width = 400, height = 400) # Creating Canvas
canvas1.place(x=0, y=0, width=400, height=400)  #Placing Canvas
#Keep in mind, there are three layout managers: place, pack and grid. On my case, I am using place.


canvas1.create_image( 0, 0, image = pic, anchor = "nw") # Display image

btn = Button(root, text="Login")
btn.place(x=0, y=0, width=200, height=50)

# Execute tkinter
root.mainloop()