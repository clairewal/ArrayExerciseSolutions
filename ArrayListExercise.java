package array.exercise;

import java.util.ArrayList;

public class ArrayListExercise {
	

		// Working as a software develop you need to implement the following 
		// methods to manage orders:
		// 1. Add a new order
		// 2. Return the name of the order
		// 3. Modify the order
		// 4. Remove an order
		// 5. Add the order to the doneOrders array
		// 6. Prints length of orders and doneOrders
		// 7. Clears arrays
		
		//Orders: 
		// Small espresso w/ chocolate
		// Large Cold Brew
		// Medium Oat Milk Cappucino
		// Medium Flat White
		// Large Choc Cookie Frappe
		// Small Caramel Iced Latte
		// Large Cafe au Lait with extra milk
		// Medium Strawberry Iced Tea
		
		public static void orderExample () {
		
		
		ArrayList<String> OrdersArray = new ArrayList <>();
		ArrayList<String> DoneOrdersArray = new ArrayList <>();
		
		OrdersArray.add("Small espresso w/ chocolate"); 
		OrdersArray.add("Large Cold Brew");
		OrdersArray.add("Medium Oat Milk Cappucino");
		OrdersArray.add("Medium Flat White");
		OrdersArray.add("Large Choc Cookie Frappe");
		OrdersArray.add("Small Caramel Iced Latte");
		OrdersArray.add("Small Caramel Iced Latte");
		OrdersArray.add("Medium Strawberry Iced Tea");
		System.out.println(OrdersArray);
		
		// Add a new order
		OrdersArray.add("Large Tea");
		
		// Return name of order
		System.out.println(OrdersArray.get(2));
		
		// Modify the order
		OrdersArray.set(0, "Large Black Coffee");
		
		// Remove an order 
		OrdersArray.remove(1);
		
		// Add to doneOrders
		DoneOrdersArray.add("Small espresso w/ chocolate");
		
		// Prints Orders
		System.out.println("Current coffee orders" + OrdersArray.size());
		System.out.println("Completed coffee orders" + DoneOrdersArray.size());
		
		// Clears Arrays
		OrdersArray.clear();
		DoneOrdersArray.clear();
		
		}

		
		public static void main(String[] args) {
			
			ArrayList<String> ordersArray = new ArrayList <>();
			ArrayList<String> doneOrdersArray = new ArrayList <>();
			
		}
			
			public static void addOrder(String order, ArrayList<String> ordersArray) {
				ordersArray.add(order);
		
		}
			
			public static String getOrder(ArrayList<String> ordersArray) {
				return ordersArray.get(ordersArray.size()-1);
				
			}
			
			public static void modifyingOrder(String order, ArrayList<String> ordersArray) {
				ordersArray.set(index, order);  
				
			}
			
			public static void removeOrder(int index, ArrayList<String> ordersArray) {
				ordersArray.remove(index);
				
			}
			
			public static void addDone(String order, ArrayList<String> doneOrdersList) {
				doneOrdersList.add(order);
				
			}
			
			public static int printLength(ArrayList<String> ordersArray) {
				return ordersArray.size(); 
				
			}
			
			public static int printLengthDone(ArrayList<String> doneOrdersList) {
				return doneOrdersList.size();
				
			}
			
			
			public static void deleteArray(ArrayList<String> doneOrdersArray, ArrayList<String> ordersArray, boolean clearBoth, boolean clearDoneOrder) {
				if(clearBoth) {
					doneOrdersArray.clear();
					ordersArray.clear();
					
				} else if(clearDoneOrder) {
					doneOrdersArray.clear();
				} else {
					ordersArray.clear();
				
				}
				
			}
			
			
	}
			
			
			
			
			
		
		
		


