from tkinter import *
import mysql.connector

dbz = mysql.connector.connect(host='localhost',
                             user="root",
                             passwd="",
                             database="test")


pointer = dbz.cursor(buffered=True)
pointer.execute("SELECT * FROM employees")


username = pointer.fetchone()[1]

class pos:
    def __init__(self, window): #Constructor
        self.window = window
        self.window.geometry("700x700")
        self.height = 700
        self.width = 700


        #This is the login screen
        self.login_screen = Frame(self.window, bg="pink")
        self.login_screen.place(x=0, y=0, width=self.width, height=self.height)
        self.login_btn = Button(self.login_screen, text="Login", command=self.go_to_index)
        self.login_btn.place(width=200, height=60, x=250, y= 400)
        self.user_entry = Entry(self.login_screen)
        self.user_entry.place(width=300, height=60, x=200, y=100)
        

        #This is the index screen
        self.index_screen = Frame(self.window, bg="cyan")
        self.logout_btn = Button(self.index_screen, text="Logout", command=self.logout)
        self.logout_btn.place(width=200, height=60, x=500, y=20)
        self.my_lbl = Label(self.index_screen, text="Welcome " + username, font=("arial", 50))
        self.my_lbl.place(x=0, y=0)

    def go_to_index(self):
        if username == self.user_entry.get():
            self.login_screen.place_forget()
            self.index_screen.place(x=0, y=0, width=self.width, height=self.height)
        else:
            print("New Employee Added")
            pointer.execute("INSERT into employees(emp_id, fname, lname, country) VALUES(%s, %s, %s, %s)", (20, self.user_entry.get(), "Silvias", "PH"))
            dbz.commit()

    def logout(self):
        self.index_screen.place_forget()
        self.login_screen.place(x=0, y=0, width=self.width, height=self.height)


win = Tk()
my_app = pos(win)