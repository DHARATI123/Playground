#include<iostream>
using namespace std;
struct College
{
char name[100];
char city[100];
int establishmentYear;
float passPercentage;
};
int main()
{
  int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  College col[n];
  for(int i=0;i<n;i++){
  cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cout<<"Enter city"<<endl;
    cout<<"Enter year of establishment"<<endl;
    cout<<"Enter pass percentage"<<endl;
  }/*
   for(int i=0;i<n;i++){
  cout<<"Enter the details of college "<<i+2<<endl;
    cout<<"Enter name"<<endl;
    cout<<"Enter city"<<endl;
    cout<<"Enter year of establishment"<<endl;
    cout<<"Enter pass percentage"<<endl;
  }
   for(int i=0;i<n;i++){
  cout<<"Enter the details of college "<<i+3<<endl;
    cout<<"Enter name"<<endl;
    cout<<"Enter city"<<endl;
    cout<<"Enter year of establishment"<<endl;
    cout<<"Enter pass percentage"<<endl;
  }*/
  cout<<"Details of colleges"<<endl;
   for(int i=0;i<n;i++){
     cout<<"College:"<<i+1<<endl;
     cin>>col[i].name;
     cout<<"Name:"<<col[i].name<<endl;
     cin>>col[i].city;
     cout<<"City:"<<col[i].city<<endl;
     cin>>col[i].establishmentYear;
     cout<<"Year of establishment:"<<col[i].establishmentYear<<endl;
     cin>>col[i].passPercentage;
     cout<<"Pass percentage:"<<col[i].passPercentage<<endl;
   }
}
   /*for(int i=0;i<n;i++){
     cout<<"College:"<<i+2<<endl;
     cin>>col[i].name;
     cout<<"Name:"<<col[i].name<<endl;
     cin>>col[i].city;
     cout<<"City:"<<col[i].city<<endl;
     cin>>col[i].establishmentYear;
     cout<<"Year of establishment:"<<col[i].establishmentYear<<endl;
     cin>>col[i].passPercentage;
     cout<<"Pass percentage:"<<col[i].passPercentage<<endl;
   }
 */