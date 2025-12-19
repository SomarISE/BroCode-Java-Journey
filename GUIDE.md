# 🛠 Somar's Java & WSL Cheat Sheet

## 1. Opening the Project
* **Open WSL:** Search for `Ubuntu` in Windows Start.
* **Navigate to folder:** `cd /mnt/c/Users/sbras/Desktop/test`.
* **Open VS Code:** Type `code .`.

## 2. The Development Cycle (The Routine)
1. **Write Code:** Create a new `.java` file or edit `Main.java`.
2. **Save:** Press `Ctrl + S` (Mandatory!).
3. **Compile:** `javac NameOfFile.java`.
4. **Run:** `java NameOfFile`.

## 3. Java Basics Learned
* **Scanner:** Used for user input. Remember to `import java.util.Scanner;`.
* **Variables:** `int` (whole numbers), `double` (decimals), `String` (text).
* **NextLine Trick:** Use `scanner.nextLine()` after `nextInt()` to clear the buffer.

## 4. GitHub Commands (Building the Portfolio)
* `git add .` (Stage all changes).
* `git commit -m "Description of what I learned"`.
* `git push` (Upload to GitHub - Use **PAT Token** as password).

## 5. Pro Tips
* **Terminal Toggle:** `Ctrl + ~` to hide/show the terminal.
* **Connection Check:** Ensure bottom-left says **WSL: Ubuntu**.