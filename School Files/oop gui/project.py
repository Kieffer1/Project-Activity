from tkinter import *

#Window
class pos:
    def __init__(self, window): #Constructor
        self.window = window
        self.window.title("Companion Management")
        self.window.geometry("700x700")
        self.height = 700
        self.width = 900
        


        #This is the login screen
        self.login_screen = Frame(self.window, bg="royal blue")
        self.login_screen.place(x=0, y=0, width=self.width, height=self.height)
        self.login_btn = Button(self.login_screen, text="Login", command=self.go_to_index)
        self.login_btn.place(width=200, height=60, x=250, y= 400)
        self.user_entry = Entry(self.login_screen)
        self.user_entry.place(width=250, height=20, x=225, y=100)
        self.user_lbl = Label(self.login_screen, text="Username" , font=("arial", 10), bg="royal blue")
        self.user_lbl.place(x=320, y=70)
        self.pass_entry = Entry(self.login_screen)
        self.pass_entry.place(width=250, height=20, x=225, y=160)
        self.user_lbl = Label(self.login_screen, text="Password" , font=("arial", 10), bg="royal blue")
        self.user_lbl.place(x=320, y=130)
        

        #This is the index screen
        self.index_screen = Frame(width="900", height="700", bg="green")
        self.logout_btn = Button(self.index_screen, text="Home", command=self.logout)
        self.logout_btn.place(width=100, height=30, x=580, y=20)
        self.done_btn = Button(self.index_screen, text="DONE", command=self.done)
        self.done_btn.place(width=100, height=30, x=300, y=620)
        

        #This is the Confirmation Screen
        self.done_screen = Frame(self.window, bg="teal")
        self.done_btn = Button(self.done_screen, text="Home", command=self.back_to_login)
        self.done_btn.place(width=100, height=30, x=300, y=620)
        self.done_lbl = Label(self.done_screen, text="The following accounts are already Added!" , font=("arial", 25), bg="teal")
        self.done_lbl.place(x=50, y=255)
        self.done_lbl = Label(self.done_screen, text="😊👍" , font=("arial", 50), bg="teal")
        self.done_lbl.place(x=280, y=300)


        #Column One
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=100)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=120)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=140)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=160)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=180)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=200)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=220)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=240)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=260)
        self.columnone_entry = Entry(self.index_screen)
        self.columnone_entry.place(width=150, height=20, x=50, y=280)

        #Column Two
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=100)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=120)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=140)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=160)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=180)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=200)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=220)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=240)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=260)
        self.columntwo_entry = Entry(self.index_screen)
        self.columntwo_entry.place(width=150, height=20, x=200, y=280)

        #Column Three
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=100)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=120)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=140)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=160)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=180)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=200)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=220)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=240)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=260)
        self.columnthree_entry = Entry(self.index_screen)
        self.columnthree_entry.place(width=150, height=20, x=350, y=280)

        #Column Four
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=100)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=120)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=140)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=160)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=180)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=200)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=220)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=240)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=260)
        self.columnfour_entry = Entry(self.index_screen)
        self.columnfour_entry.place(width=150, height=20, x=500, y=280)


    def go_to_index(self):
            self.login_screen.place_forget()
            self.index_screen.place(x=0, y=0, width=self.width, height=self.height)

    def logout(self):
        self.index_screen.place_forget()
        self.login_screen.place(x=0, y=0, width=self.width, height=self.height)

    def done(self):
        self.index_screen.place_forget()
        self.done_screen.place(x=0, y=0, width=self.width, height=self.height)

    def back_to_login(self):
        self.done_screen.place_forget()
        self.login_screen.place(x=0, y=0, width=self.width, height=self.height)


win = Tk()
my_app = pos(win)
win.mainloop()
