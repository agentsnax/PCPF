#include <iostream.h>
#include <conio.h>

class Rectangle {
private:
    double length;
    double width;
public:
    void setLength(double l) {
        if (l > 0) {
            length = l;
        } else {
            cout << "Invalid length" << endl;
        }
    }
    
    void setWidth(double w) {
        if (w > 0) {
            width = w;
        } else {
            cout << "Invalid width" << endl;
        }
    }

    double getArea() {
        return length * width;
    }
};

int main() {
    clrscr(); // Clear screen in Turbo C++
    Rectangle rect;
    rect.setLength(5.0);
    rect.setWidth(3.0);
    cout << "Area of rectangle is: " << rect.getArea() << endl;
    getch(); // Wait for a key press
    return 0;
}
