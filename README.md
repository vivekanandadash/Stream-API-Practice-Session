# 🚀 Java Streams Practice Repository

This repository is designed to  **Master Java Streams API** step by step — from basics to advanced interview-level problems.

It is structured in a clean and modular way for easily navigate, practice, and revise concepts.

---

## 📂 Project Structure

```
com/
├── basics/
│   ├── StreamCreation.java
│   └── LazyEvaluation.java

├── intermediate/
│   ├── FilterMap.java
│   └── FlatMap.java

├── terminal/
│   ├── ReduceAndCount.java
│   └── MatchAndFind.java

├── collectors/
│   ├── GroupingBy.java
│   ├── PartitioningBy.java
│   ├── ToMapAndJoining.java
│   └── Employee.java

├── sorting/
│   └── ComparatorChain.java

├── primitivestreams/
│   └── IntLongDouble.java

└── practiceproblems/
    ├── FindDuplicates.java
    ├── TopNSalaries.java
    ├── FrequencyCount.java
    └── FlattenNestedList.java
```

---

## 📘 Topics Covered

### 🔹 Basics
- Stream creation methods:
  - Stream.of()
  - Stream.iterate()
  - Stream.generate()
  - From collections (List, Set)
- Lazy evaluation using peek()

---

### 🔹 Intermediate Operations
- filter()
- map()
- distinct()
- sorted()
- limit()
- skip()
- flatMap() (very important for interviews)

---

### 🔹 Terminal Operations
- reduce()
- count()
- min() / max()
- anyMatch(), allMatch()
- findFirst(), findAny()

---

### 🔹 Collectors
- groupingBy() → Group data (e.g., employees by department)
- partitioningBy() → Split data based on condition
- toMap() → Convert stream to map
- joining() → Combine strings
- counting()

---

### 🔹 Sorting
- Comparator chaining using:
  - Comparator.comparing()
  - thenComparing()

---

### 🔹 Primitive Streams
- IntStream, LongStream, DoubleStream
- range(), rangeClosed()
- sum(), average()

---

### 🔹 Practice Problems (Interview Focused)
- Find duplicate elements
- Top N salaries
- Frequency count of elements
- Flatten nested lists

---

## 🎯 Purpose of This Repository

- Strengthen Java Streams fundamentals
- Practice real-world and scenario-based problems
- Improve problem-solving using functional programming

---

## 🛠️ How to Use

1. Start from the basics package  
2. Move step-by-step to intermediate → terminal → collectors  
3. Practice problems in practiceproblems/  
4. Try to solve problems without looking at the solution first  

---

## 💡 Pro Tip

While practicing:
- First write traditional loop solution
- Then convert it into Stream API
- This will build strong logic + understanding

---

## 👨‍💻 Author

Vivekananda Dash
