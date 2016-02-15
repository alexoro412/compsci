#Unity functions:
---

### Basic Functions

void start() called when script first starts if it is enabled

awake() called first, even if script not enabled

update() called every frame

fixedupdate() called on regular timeline
[make sure all physics code is in here]

Translate

- transform.Translate(Vector3 * movespeed * Time.deltaTime);

Rotate

- transform.Rotate(Vector3, turnSpeed * Time.deltaTime)


Destroy

- Destroy(GameObject);
- Destroy(GetComponent<"$NAME">());

Key Input

- Input.GetKeyDown|GetKey|GetKeyUp()
- Down|Held|Released
- Input.GetButtonDown|GetButton|GetButtonUp()

On Mouse Down
- OnMouseDown()
---

### Helper Functions

Get Component

- C# : GetComponent<"$NAME">();
- JS : GetComponent("$NAME");

---

transform.LookAt(target);

---

Set Active

- SetActive();

---

Vector3.magnitude

dot product:
  Vector3.dot(VectorA, VectorB)
  (Ax * Bx) + (Ay + By) + (Az + Bz)
  if == 0 then perpendicular
Cross product:
  Vector3.Cross(VectorA, VectorB)
  returns vector perpendicular to two vectors


Start of every file
C# :
using UnityEngine;
using System.Collections;

JS :
#pragma strict
