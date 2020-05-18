#include<iostream>
using namespace std;
struct employee{
  char name[50];
  int id;
  int age;
  char desi[50];
  int sal;
};  
int main()
{ 
   struct employee emp = { "Rajarajan" , 1 , 24 ,"Manager" , 20000 };
  cout<<"Enter name:"<<endl;
  cout<<"Enter ID:"<<endl;
  cout<<"Enter age:"<<endl;
  cout<<"Enter designation:"<<endl;
  cout<<"Enter Salary:"<<endl;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<emp.name<<endl;
  cout<<"ID of the Employee : "<<emp.id<<endl;
  cout<<"Age of the Employee : "<<emp.age<<endl;
  cout<<"Designation of the Employee : "<<emp.desi<<endl;
  cout<<"Salary of the Employee : "<<emp.sal<<endl;

}