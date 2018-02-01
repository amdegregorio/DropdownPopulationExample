package amdegregorio.dropdownpopulationexample;

public class ShapeForm {
   private String shapeType;
   private String shape;
   
   /**
    * Gets shapeType.
    * @return the shapeType
    */
   public String getShapeType() {
      return shapeType;
   }
   
   /**
    * Sets shapeType.
    * @param shapeType the shapeType to set
    */
   public void setShapeType(String shapeType) {
      this.shapeType = shapeType;
   }
   
   /**
    * Gets shape.
    * @return the shape
    */
   public String getShape() {
      return shape;
   }
   
   /**
    * Sets shape.
    * @param shape the shape to set
    */
   public void setShape(String shape) {
      this.shape = shape;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "ShapeForm [shapeType=" + shapeType + ", shape=" + shape + "]";
   }
   
}
