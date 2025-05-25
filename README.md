# Occupy End-to-End Tests (Playwright + Java)

This repository contains end-to-end (E2E) test automation scripts for [Occupy](https://www.occupymart.com/) built using [Playwright](https://playwright.dev/java/) and Java.

## 🚀 Overview

These tests are designed to verify core functionalities of the Occupy platform across multiple browsers including Chrome, Firefox, and Safari. The test suite is built with:

- **Playwright for Java**: For browser automation.
- **TestNG**: For test organization and execution.
- **Maven**: For dependency management and build control.

## 📁 Project Structure
<pre lang="markdown"> ```bash ├── src │ ├── main │ │ └── java │ │ └── com.occupy.factory # Playwright factory setup │ │ └── com.occupy.pages # Page Object Model classes │ ├── test │ │ └── java │ │ └── com.occupy.test # TestNG test cases ├── pom.xml # Maven dependencies ├── README.md ``` </pre>

## ✅ Features

- Multi-browser support (Chromium, Firefox, WebKit)
- Page Object Model for better test structure
- Reusable Playwright factory
- TestNG for test lifecycle management

## 🧪 Running Tests

Make sure [Java (17+)](https://adoptopenjdk.net/) and [Maven](https://maven.apache.org/) are installed.

1. Clone the repo:
   ```bash
   git clone https://github.com/VershimaKelvin/Occupy_End2End_Test.git
   cd Occupy_End2End_Test
2. Run tests with Maven:
   ```bash
   mvn clean test
3. You can choose the browser to run with via the factory method (chrome, firefox, safari, or chromium).
   ```bash
   Page page = new PlaywrightFactory().intiBrowser("chrome");
  
