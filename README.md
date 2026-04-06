# 💰 FinSafe Transaction Validator (Core Java)

A simple **console-based digital wallet system** built using Core Java.  
This project simulates a secure transaction system that prevents overdraft errors and maintains transaction history.

---

## 🚀 Features

- ✅ Deposit Money
- ✅ Withdraw Money with Validation
- ✅ Prevent Overdraft (Custom Exception)
- ✅ Maintain Last 5 Transactions
- ✅ Mini Statement Display
- ✅ Proper Error Handling

---

## 🧠 Concepts Used

- 🔒 Encapsulation (Private variables in Account class)
- ⚠️ Custom Exception (`InsufficientException`)
- 📦 ArrayList (Transaction History)
- 🔁 Conditional Logic (if-else)
- 🛑 Exception Handling (try-catch)

---

## 🏗️ Project Structure
# 💰 FinSafe Transaction Validator (Core Java)

A simple **console-based digital wallet system** built using Core Java.  
This project simulates a secure transaction system that prevents overdraft errors and maintains transaction history.

---

## 🚀 Features

- ✅ Deposit Money
- ✅ Withdraw Money with Validation
- ✅ Prevent Overdraft (Custom Exception)
- ✅ Maintain Last 5 Transactions
- ✅ Mini Statement Display
- ✅ Proper Error Handling

---

## 🧠 Concepts Used

- 🔒 Encapsulation (Private variables in Account class)
- ⚠️ Custom Exception (`InsufficientException`)
- 📦 ArrayList (Transaction History)
- 🔁 Conditional Logic (if-else)
- 🛑 Exception Handling (try-catch)

---

## 🏗️ Project Structure
FinSafe/
│
├── Account.java
├── InsufficientException.java
├── Main.java
└── README.md


---

## 📌 How It Works

1. User selects an option:
   - Deposit
   - Withdraw
   - View History

2. System validates:
   - ❌ Negative amount → Error
   - ❌ Amount > balance → Exception

3. If valid:
   - Balance updated
   - Transaction stored (last 5 only)

---

## ⚙️ Setup & Run

### 🔹 Compile

```bash
javac *.java
run java main
