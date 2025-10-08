# Java vs Python: Primitive vs Reference Type Behavior

## 🔸 Java: Primitive Type Example

```java
int num1 = 11;
int num2 = num1;
num1 = 22;

System.out.println(num1); // prints 22
System.out.println(num2); // prints 11
```

### 🧠 What's Happening:

- `num1 = 11;` → `num1` holds the value 11 directly.
- `num2 = num1;` → a **copy** of the value `11` is made and stored in `num2`.
- `num1 = 22;` → `num1` is updated, but `num2` remains unchanged.

### 📌 Why?

Because `int` is a **primitive type**, Java **passes and assigns it by value**. There is **no reference**, only value copying.

---

## 🔸 Java: Reference Type Example (`HashMap`)

```java
HashMap<String, Integer> map1 = new HashMap<>();
map1.put("a", 11);

HashMap<String, Integer> map2 = map1;  // Reference copy

map1.put("a", 22);

System.out.println(map1.get("a")); // 22
System.out.println(map2.get("a")); // 22
```

### 🧠 What's Happening:

- `map1` points to a memory object: `{a=11}`
- `map2 = map1;` → `map2` now **points to the same object**
- `map1.put("a", 22);` modifies the **shared object**

### 📌 Why?

Because **`HashMap` is an object (reference type)**. Assigning it only copies the reference, so both variables point to the **same underlying memory**.

---

## 🔧 How to Clone a HashMap

If you want **two separate HashMaps**:

```java
HashMap<String, Integer> map2 = new HashMap<>(map1);
```

Now modifying `map1` will **not affect** `map2`.

---

## 🔸 Python: Primitive Type Example

```python
def modify_int(x):
    x += 10

value = 5
modify_int(value)
print(value)  # Output: 5
```

### 🧠 Why?

Integers are **immutable** in Python. `x += 10` creates a new integer, leaving the original untouched.

---

## 🔸 Python: Reference Type Example (`dict`)

```python
def modify_dict(d):
    d["a"] = 100

my_dict = {"a": 1}
modify_dict(my_dict)
print(my_dict["a"])  # Output: 100
```

### 🧠 Why?

Dictionaries are **mutable**, and you're modifying the object itself, so the change is visible outside the function.

---

## 🧭 Visual Diagram

### 🟩 Java Primitive

```
num1 ──> 11
num2 ──> 11  (copied value)

After num1 = 22:

num1 ──> 22
num2 ──> 11
```

### 🟨 Java HashMap

```
heap ──> { a: 11 }
           ▲
           │
 map1 ─────┘
           ▲
 map2 ─────┘

After map1.put("a", 22):

heap ──> { a: 22 }
Both map1 and map2 see the update
```

---

## ✅ Summary

| Language | Type        | Assignment `b = a` Copies | Changes to `a` affect `b`? | Why?                |
|----------|-------------|---------------------------|-----------------------------|---------------------|
| Java     | `int`       | Value                     | ❌ No                       | Primitive type      |
| Java     | `HashMap`   | Reference                 | ✅ Yes                      | Reference to object |
| Python   | `int`       | Immutable object          | ❌ No                       | Rebinding occurs    |
| Python   | `dict`      | Mutable object            | ✅ Yes                      | Reference to object |

---

Let me know if you'd like more examples or deep vs shallow copy explanations!