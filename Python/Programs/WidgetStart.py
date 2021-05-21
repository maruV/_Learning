# Start code for Widget class

class Widget():
	# Note that the test code down below does not check if the defaults here are working
	# correctly, but this may be tested while grading.  If you don't change this it
	# will work correctly.
	def __init__(self, color="black", weight=10.0):
		self.color = color
		self.weight = weight
		
	def __str__(self):
		return "%s widget; weight = %.2f" % (self.color, self.weight)
		
	def __lt__(self, other):  # is self lighter than other?
		# FIXME
		
	def __le__(self, other):  # is self lighter or equal to other?
		# FIXME

	def __gt__(self, other):  # is self heavier than other?
		# FIXME
		
	def __ge__(self, other):  # is self heavier or equal to other?
		# FIXME

	def __eq__(self, other):  # is self equal in weight to other?
		# FIXME
		
	def __ne__(self, other):  # is self unequal in weight to other?
		# FIXME

	# Create a new widget by "adding" two existing widgets.  The weight of the new
	# widget will be the sum of the weights of the two.  The color of the new widget
	# will be the same as the other two if their colors are the same, otherwise,
	# the new widget's color will be "white" 
	def __add__(self, other):
		# FIXME

		
if __name__ == "__main__":

# When this test code executes it should produce the following if your implementation
# of the code above is correct
# 
# green widget; weight = 4.50
# red widget; weight = 12.20
# green widget; weight = 9.60
# blue widget; weight = 2.00
# 
# Do comparison tests.
# <
# False  False  False  True  
# <=
# True  False  False  True  
# >
# False  True  True  False  
# >=
# True  True  True  False  
# ==
# True  False  False  False  
# !=
# False  True  True  True  
# 
# test_widget + others.
# green widget; weight = 9.00
# white widget; weight = 16.70
# green widget; weight = 14.10
# white widget; weight = 6.50
# 
# test_widget2 + others.
# white widget; weight = 9.50
# red widget; weight = 17.20
# white widget; weight = 14.60
# white widget; weight = 7.00

	widget_list = []
	widget_list.append(Widget("green", 4.5))
	widget_list.append(Widget("red", 12.2))
	widget_list.append(Widget("green", 9.6))
	widget_list.append(Widget("blue", 2))
	
	for widget in widget_list:
		print(widget)
		
	test_widget = Widget("green", 4.5)
	test_widget2 = Widget("red", 5)
	
	print("\nDo comparison tests.")
	print("<")
	for widget in widget_list:
		print(widget < test_widget, end="  ")
	print()
		
	print("<=")
	for widget in widget_list:
		print(widget <= test_widget, end="  ")
	print()
		
	print(">")
	for widget in widget_list:
		print(widget > test_widget, end="  ")
	print()
		
		
	print(">=")
	for widget in widget_list:
		print(widget >= test_widget, end="  ")
	print()
		
	print("==")
	for widget in widget_list:
		print(widget == test_widget, end="  ")
	print()
		
	print("!=")
	for widget in widget_list:
		print(widget != test_widget, end="  ")
	print()

	print("\ntest_widget + others.")
	for widget in widget_list:
		print(widget + test_widget)
		
	print("\ntest_widget2 + others.")
	for widget in widget_list:
		print(test_widget2 + widget)
						