package Example;

/**
* Example/ModesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from example.idl
* Wednesday, October 9, 2013 1:11:20 PM IST
*/

public final class ModesHolder implements org.omg.CORBA.portable.Streamable
{
  public Example.Modes value = null;

  public ModesHolder ()
  {
  }

  public ModesHolder (Example.Modes initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Example.ModesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Example.ModesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Example.ModesHelper.type ();
  }

}
