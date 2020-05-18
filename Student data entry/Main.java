#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{  
     struct student s;
   cout<<"\nStudent Details"<<endl;
  cin.getline(s.name, 30);
 cout<<"Name: "<<s.name<<endl;
  cin>>s.roll;
  cout<<"Roll: "<<s.roll<<endl;
 cin>>s.marks;
 cout<<"Marks: "<<s.marks<<endl;
   //Your code goes here
}