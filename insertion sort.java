void main ()  
{  
    int i,j, k,temp;  
    int a[10] = { 1, 90, 7, 11, 3, 44, 112, 8, 34, 25};   
    printf("\nprinting sorted elements...\n");  
    for(k=1; k<10; k++)   
    {  
        temp = a[k];  
        j= k-1;  
        while(j>=0 && temp <= a[j])  
        {  
            a[j+1] = a[j];   
            j = j-1;  
        }  
        a[j+1] = temp;  
    }  
    for(i=0;i<10;i++)  
    {  
        printf("\n%d\n",a[i]);  
    }  
}  
