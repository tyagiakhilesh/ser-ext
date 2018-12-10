## Externalization (Re construction of object)

- You need a defualt constructor 
- implement `java.io.Externalizable`
- override `readExternal(ObjectInput in)`, `writeExternal(ObectOutput out)` 
(Note: arguments are ObjectInput/Output)

## Serializabel (Resotring the object)

- Default constructor not needed
- Implenent `java.io.Serializable` (if not done then `NotSerializableException` shall
be thrown)
- JVM shall do its bit if you don't override `readObject` and `writeObject`
- Classes that require special handling during the serialization and deserialization process must implement special methods with these exact signatures:
```
 private void writeObject(java.io.ObjectOutputStream out)
     throws IOException
 private void readObject(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException;
 private void readObjectNoData()
     throws ObjectStreamException;
```
