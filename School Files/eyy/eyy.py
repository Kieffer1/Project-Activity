import qrcode
img = qrcode.make("teh ano")
img.save("namiboobies.jpg")

import cv2
d = cv2.QRCodeDetector()
val1, val2, val3 = d.detectAndDecode(cv2.imread("namiboobies.jpg"))
print(val1)
