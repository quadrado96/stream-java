# Employee Data Processor

This program reads employee data from a `.txt` or `.csv` file and performs the following tasks:

1. Displays the email addresses of employees whose salary is higher than a value provided by the user, sorted in alphabetical order.
2. Calculates and displays the sum of salaries for employees whose names start with the letter 'M'.

## File Format

The input file should be in `.txt` or `.csv` format, with each line containing the following employee data, separated by commas:

```
Name,Email,Salary
```

### Example:

```
John Doe,john.doe@example.com,5000.00
Mary Jane,mary.jane@example.com,6000.00
Michael Scott,michael.scott@example.com,7000.00
```

## How to Use

1. Run the program.
2. Enter the path to the `.txt` or `.csv` file when prompted.
3. Enter the salary threshold when prompted.

The program will then display:

- A list of emails for employees whose salary is above the entered threshold, sorted alphabetically.
- The sum of the salaries of employees whose names start with the letter 'M'.

## Example Output

Assuming the file contains the following data:

```
Alice,a.smith@example.com,4000.00
Bob,b.jones@example.com,5500.00
Maria,m.garcia@example.com,7000.00
Michael,m.scott@example.com,6000.00
```

And you enter `5000.00` as the salary threshold, the program will output:

```
Emails of people whose salary is more than 5000.0:
b.jones@example.com
m.garcia@example.com
m.scott@example.com

Sum of salary of people whose name starts with 'M': 13000.0
```

## Requirements

- Java 8 or higher
