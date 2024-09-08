# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.

A.  Create your subgroup and project by logging into GitLab using the web link provided and using the “GitLab How-To” web link, and do the following:
•  Clone the project to the IDE.
•  Commit with a message and push when you complete each of the tasks listed below (e.g., parts C to J).

Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.

•  Submit a copy of the Git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.

Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.

B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.
    1. Updated README.md: lines 6-56 for task requirements. Date: 9/7.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.
    2. Update mainscreen.html: lines 14/19/21/53 for appropriate titles. Date: 9/7.

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
    3. Created about.html file with link back to mainsceen.html: lines 1-13. Updated mainscreen.html with button to about.html: line 90. Updated MainScreenControllerr for about.html mapping: lines 55-58. Updated README.md for task D. Date: 9/7.

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.
    4. Updated BootStrapData.java for 5 "parts" and 5 "products" with if-statement condition to prevent duplicates: lines 43-50/52-85/93-137. Date: 9/7.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.
    5. Updated mainscreen.html for "Buy Now" button: lines 84-85, created confirmbuysucess.html: lines 1-11, created confirmbuyfailure.html: lines 1-11, created BuyProductController.java: lines 1-42. Updated README.md for task F.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
    6. Updated Part.java for adding min/max Inventory as well as validateLimits call: lines 33-36, 50-51, 59-60, 94-101, 128-136. Updated PartServiceImpl.java to call validateLimits method: line 59, updated InhousePartServiceImpl.java to call validateLimits method: line 54. Updated OutsourcedPartServiceImpl.java to call validateLimits method: line 52. Updated InhousePart.java and OutsourcedPart.java to set min/max values: lines 18-19. Updated mainscreen.html for part section for min/max inv headers, set temp IDs for min/max inv: line 37-38, 47-48. BootStrapData.java updated parts for min/max inventory: lines 51-52, 62-63, 72-73, 82-83,92-93. InhousePartForm.html and OutsourcedPartForm.html updated for placeholders for min/max inv: line 27-32.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
    7. 

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
    8. 

J.  Remove the class files for any unused validators in order to clean your code.
    9. 
