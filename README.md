# hackerrank
___________________________________________________________________________________________________________
NumberFormat use .getCurrencyInstance(Local.US) and not 
                 .getNumberInstance(Local.US) if want to display currency in format with symbol like$.
___________________________________________________________________________________________________________

Calendar cal = Calendar.getInstance();
        cal.set(month, day, year);
        int ans = cal.get(Calendar.DAY_OF_WEEK);
------------------------------------------------------------------------------------------------------------
To format date and time:
DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj); 
__________________________________________________________________________________________________________

substring (start,end) - output: start,end-1
 substr = str.substring(7, 17);

____________________________________________________________________________________________________________
pls remember even if the values are same then too stringbuffer are not equal.
____________________________________________________________________________________________________________
