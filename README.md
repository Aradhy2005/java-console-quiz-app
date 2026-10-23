# ☕ Java Console Quiz App

<p align="center">
  A simple, interactive quiz application built with Core Java to practise object-oriented programming, user input handling, and score calculation.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java"/>
  <img src="https://img.shields.io/badge/Project-Console%20Application-blue?style=for-the-badge" alt="Console Application"/>
  <img src="https://img.shields.io/badge/Focus-Core%20Java-success?style=for-the-badge" alt="Core Java"/>
</p>

---

## 📌 About the Project

**Java Console Quiz App** is a beginner-friendly Java project that presents multiple-choice questions through the terminal and calculates the user's score based on their answers.

The project was created as a hands-on exercise to strengthen Core Java fundamentals and understand how multiple classes interact in an object-oriented application.

## ✨ Features

- 📝 Multiple-choice questions with four options each
- ⌨️ Interactive answer input through the console
- 🧮 Automatic score calculation
- 🧩 Separate classes for questions, quiz logic, and application execution
- ☕ Built using fundamental Java concepts without external libraries

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Core application logic |
| OOP | Organizing code into classes and objects |
| Arrays | Storing questions and answers |
| Scanner | Reading user input |
| Loops and conditionals | Processing answers and calculating scores |

## 📂 Project Structure

```text
java-console-quiz-app/
├── src/
│   ├── Main.java
│   ├── Question.java
│   └── QuestionService.java
└── README.md
```

*Note: The structure above represents the suggested layout. Adjust it to match your actual repository.*

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- A terminal or Java-compatible IDE
- Basic familiarity with compiling and running Java programs

Check your Java installation:

```bash
java -version
javac -version
```

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/YOUR-USERNAME/java-console-quiz-app.git
```

**2. Navigate to the project directory**

```bash
cd java-console-quiz-app
```

**3. Compile the source files**

If all three `.java` files are in the same `src` directory and use no package declaration:

```bash
javac -d out src/*.java
```

**4. Run the application**

```bash
java -cp out Main
```

## 🎮 How It Works

1. The application initializes a collection of quiz questions.
2. Each question and its four options are displayed in the console.
3. The user submits an answer for each question.
4. The application compares submitted answers with the correct answers.
5. The final score is displayed after the quiz ends.

## 📚 Concepts Practised

- Classes and objects
- Constructors and methods
- Encapsulation through getters
- Arrays and loops
- User input with `Scanner`
- Conditional statements
- Basic program flow and score calculation

## 🔮 Future Improvements

- [ ] Validate user input and handle invalid options
- [ ] Accept option numbers (`1–4`) instead of requiring answer text
- [ ] Display correct answers and explanations
- [ ] Randomize question order
- [ ] Add difficulty levels and categories
- [ ] Load questions from an external file
- [ ] Introduce a graphical interface or a Spring Boot API

## 🎯 Learning Objective

This project is part of my journey to strengthen Java fundamentals before moving into more advanced Java development and backend engineering with Spring Boot.

## 🤝 Contributions

Suggestions and constructive feedback are welcome. Feel free to fork the repository and experiment with additional features.


---

<p align="center">
  <b>Built with ☕ and a commitment to learning Java.</b>
</p>
