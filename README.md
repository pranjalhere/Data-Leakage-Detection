# Data Leakage Detection

## Project Overview

Data Leakage Detection is a Java-based application developed using NetBeans IDE and Swing for creating a file transfer protocol. The project utilizes a MySQL database, specifically from XAMPP server, for storing information about users, files, and file transfers. The main functionality of the application allows users to securely send files to each other, requiring a passkey for file downloads. The project includes an admin role with complete control over user activities, monitoring file transfers, and detecting potential data leaks.

## Prerequisites

Before setting up the project, ensure the following prerequisites are met:

- Install XAMPP server with MySQL.
- Create the necessary tables in the MySQL database:
  - `emp`: User information table.
  - `filedata`: File information table.
  - `filetransfer`: File transfer information table.
  - `fileid`: File ID table.
  

## Libraries Used

The project relies on the following libraries:

1. **MySQL Connector**: Used to establish a connection between the Java application and the MySQL database.
   
   [MySQL Connector](https://dev.mysql.com/downloads/connector/j/)

2. **jBCrypt-0.4**: Utilized for password encryption and decryption.
   
   [jBCrypt-0.4](https://www.mindrot.org/projects/jBCrypt/)

## Setting Up the Project

Follow these steps to set up and run the project:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/pranjalhere/Data-Leakage-Detection


2. **Open in NetBeans IDE**
    
    a. Open NetBeans IDE.
    
    b. Import the project.

3. **Configure MySQL Database**

   a. Start XAMPP server and ensure MySQL is running.

   b. Create the required tables (`emp`, `filedata`, `filetransfer`, `fileid`) in the MySQL database.

5. **Add Libraries**

    a. Add the MySQL Connector JAR to the project.

    b. Add the jBCrypt-0.4 JAR to the project.

6. **Build and Run**

    Run  `scr/dlp-DLP.java`


## User Functionality

### Sending Files

- Users can send files to each other securely.

### Downloading Files

- To download a file, a user must provide the correct passkey.

## Admin Control

### Monitoring File Transfers

- Admin can monitor all file transfers.

### Detecting Leaked Data

- Admin has the authority to identify leaked data by checking unauthorized downloads.

# Acknowledgments

Special thanks to the creators of MySQL Connector and jBCrypt for their valuable contributions.

# Contributors

- Pranjal Choudhary(https://github.com/pranjalhere)

# License

This project is licensed under the Data Leakage Detection License.


