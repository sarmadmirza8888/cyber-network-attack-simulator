Project Overview
The Cyber Attack Network Simulator models a virtual computer network consisting of computers, routers, servers, and firewalls connected together as a graph structure.
The simulator allows users to:
- Create and manage network devices
- Connect devices within a network
- Send packets between systems
- Simulate malware attacks
- Observe malware spreading using BFS traversal
- Process packets using Queue structures
- Recover previous network states using Stack
- Store logs dynamically using Linked Lists
- Rank threats using Trees (BST / AVL)
The project is completely console-based and focuses on system design, simulation logic, and DSA visualization.

Features
Network Graph Simulation
- Represents devices as graph nodes
- Represents connections as graph edges
- Supports dynamic network creation

Packet Routing System
- Simulates packet transmission between devices
- Uses Queue data structure for packet handling
- FIFO packet processing mechanism

Malware Spread Simulation
- Simulates cyber attacks and malware propagation
- Uses BFS traversal for infection spread
- Displays infected systems step-by-step

Firewall Defense Mechanism
- Detects suspicious packets
- Blocks infected traffic
- Isolates compromised systems

Rollback Recovery System
- Stores previous network states
- Uses Stack for undo/rollback operations
- Restores network after attacks

Threat Ranking System
- Uses BST / AVL Tree
- Maintains threat severity rankings
- Supports efficient searching and sorting

Dynamic Activity Logs
- Uses Linked Lists for maintaining logs
- Tracks attacks, packet transfers, and firewall actions

Console-Based Visualization
- Displays network structure using ASCII diagrams
- Shows packet movement and attack progression
- Displays queue and traversal operations in real time

Data Structures & Algorithms Used

| Data Structure / Algorithm | Purpose |
|---|---|
| Graph | Network representation |
| Queue | Packet processing & BFS |
| Stack | Rollback recovery |
| Linked List | Dynamic logs |
| BST / AVL Tree | Threat ranking |
| BFS | Malware spread simulation |
| DFS | Network traversal |
| Dijkstra  | Shortest path routing |
Project Structure


src/
│
├── Main.java
│
├── graph/
│   ├── Graph.java
│   ├── Node.java
│
├── models/
│   ├── Packet.java
│   ├── Device.java
│
├── simulation/
│   ├── MalwareSimulator.java
│   ├── Firewall.java
│   ├── SimulationEngine.java
│
├── ds/
│   ├── QueueManager.java
│   ├── RollbackManager.java
│   ├── ThreatTree.java
│   ├── ActivityLog.java
│
├── utils/
│   ├── ConsoleColors.java
│   ├── NetworkVisualizer.java

Technologies Used
- Java
- IntelliJ IDEA
- Object-Oriented Programming (OOP)
- Data Structures & Algorithms

Learning Outcomes
This project helps in understanding:
- Real-world implementation of DSA
- Graph traversal algorithms
- Queue and Stack operations
- Network simulations
- Cybersecurity concepts
- System design and modular programming
- Console-based visualization techniques

Sample Console Output
===============================
 CYBER ATTACK NETWORK SIMULATOR
===============================

[NETWORK STATUS]

[PC1] ---- [ROUTER] ---- [SERVER]
   |
[PC2]

--------------------------------
INFECTED SYSTEMS: 1
ACTIVE PACKETS: 5
QUEUE SIZE: 3
THREAT LEVEL: MEDIUM
--------------------------------

1. Send Packet
2. Launch Malware
3. Activate Firewall
4. Show BFS Traversal
5. Rollback Network
6. Exit

How the Simulation Works

1. User creates devices and connections
2. Devices are stored as nodes in a graph
3. Packets are transmitted using queues
4. Malware spreads through BFS traversal
5. Firewall detects and blocks malicious packets
6. Previous states are stored in a stack
7. Threat rankings are maintained using trees
8. Logs are dynamically updated using linked lists

Future Improvements
- GUI version using Java Swing / JavaFX
- Real-time packet animation
- Multi-threaded attack simulation
- AI-based threat detection
- Network traffic analytics dashboard
- Database integration
- Advanced routing algorithms

Project Objectives
- Demonstrate practical applications of DSA
- Simulate cyber attack scenarios
- Visualize network behavior
- Improve problem-solving and system design skills
- Understand algorithmic thinking through simulations

  Installation & Execution
1. Clone the repository
git clone https://github.com/yourusername/cyber-attack-network-simulator.git
2. Open project in IntelliJ IDEA
3. Compile and run:
Main.java
4. Use the console menu to interact with the simulator
