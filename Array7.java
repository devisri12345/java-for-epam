class Array7 {


public static void main(String[] args) {

Scanner s = new Scanner(System.in);
int n=s.nextInt();
int a[] = new int[n];

for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}

//int temp=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;)
{
if(a[i]==a[j])
{
for(int k=j;k<n-1;k++)
{
a[k]=a[k+1];
}
               n=n-1;

}
else
j++;
}
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}

}
}
