# ⭕ JOSEPHUS_SIMULATOR

> **"The circle is shrinking. Place your bets. Only one vessel remains."**

![Java Version](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.1-brightgreen?style=for-the-badge&logo=springboot)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue?style=for-the-badge&logo=docker)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge&logo=freebsd)

## 💀 PROJECT_OVERVIEW
An interactive, high-stress visualization of the ancient **Josephus Problem**. This isn't just a math calculator; it's a lo-fi simulation where you choose your vessel and watch the purge sequence in real-time.


<p align="center">
  <img width="561" height="582" alt="animation" src="https://github.com/user-attachments/assets/2f1ac9e7-33e7-435d-8a2b-6240b28333cb" />
</p>

---

## 🛠️ TECH_STACK
- **Backend:** Java 21, Spring Boot 3.4.
- **API:** RESTful, documented with **Swagger**.
- **Architecture:** Clean Layered Architecture.
- **Frontend:** Vanilla JS, HTML5, CSS3 with CRT-scanline effects.
- **DevOps:** Docker Multi-stage builds for optimized image size.

---

## 🕹️ CORE_MECHANICS
- **Interactive Betting:** Select your vessel before the sequence starts.
- **Sudden Death:** If your vessel is eliminated, the system terminates immediately.
- **Dynamic Shrinking:** The circle physically shrinks as participants are removed.
- **Robust Error Handling:** Custom `GlobalExceptionHandler` with structured `ApiError` responses.

---

## 📖 API_DOCUMENTATION
Interactive Swagger UI is available at:
- http://localhost:8080/swagger-ui/index.html

---

## 💡 REFLECTIONS
This project was a deep dive into:
- Algorithm Serialization: Converting a recursive/iterative math problem into a step-by-step event history for the frontend.
- Containerization: Using Docker to ensure "it works on my machine" is a thing of the past.
- UX under constraints: Creating an engaging experience with minimal UI and interesting aesthetics.
- UI/UX created with assistance from AI for animations and styling to achieve the specific Weirdcore aesthetic.

## 🚀 QUICK_START
Make sure you have **Docker** installed.

```bash
# Clone the repository
git clone https://github.com/ger-tret/josephus-simulator.git

# Enter directory
cd josephus-simulator

# Wake up the system
docker-compose up --build
Once started, access the terminal at: http://localhost:8080

