
# emp_exp = [1-------------20]
# emp_salary = [1000-------------]
# Final Prediction?


import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.linear_model import LinearRegression
import math


# Data
data = {
    "emp_exp": [1,2,3,4,5,6,7,8,9],
    "emp_salary": [1500,250,3500,400,4500,500,550,6000,650]
}


# Create DataFrame
df = pd.DataFrame(data)
print(df)


# Shape
print("Shape:", df.shape)


# Correlation
print("\nCorrelation:")
print(df.corr())


# Plot
plt.plot(df["emp_exp"], df["emp_salary"], color="r", linestyle="--")

sns.scatterplot(data=df, x="emp_exp", y="emp_salary")

plt.xlabel("Employee Experience")
plt.ylabel("Employee Salary")
plt.title("Employee Data with Experience & Salary")

plt.show()


# Data divided into X and y
X = df[["emp_exp"]]
y = df["emp_salary"]


# Model build
model = LinearRegression()


# Train model
model.fit(X, y)


# y = mx + c

# c = intercept
c = model.intercept_

# m = slope
m = model.coef_[0]


print("\nLinear Regression Equation:")
print("y =", round(m, 2), "x +", round(c, 2))

print("m =", round(m, 2))
print("c =", round(c, 2))


# Model Prediction
y_pred = model.predict(X)

print("\nPredicted Values:")
print(y_pred)


# Compare Actual and Predicted
compare_df = pd.DataFrame({
    "Experience": X["emp_exp"],
    "Actual Salary": y,
    "Predicted Salary": y_pred
})

print("\nActual vs Predicted:")
print(compare_df)


# MAE
MAE = abs(y - y_pred).mean()

print("\nMean Absolute Error:", round(MAE, 2))


# MSE
MSE = ((y - y_pred) ** 2).mean()

print("Mean Squared Error:", round(MSE, 2))


# RMSE
RMSE = math.sqrt(MSE)

print("Root Mean Squared Error:", round(RMSE, 2))


# Model Score
model_score = model.score(X, y)

print("Model Score:", round(model_score, 2))


# Final Prediction
Expe = float(input("\n Enter Experience: "))

salary = m * Expe + c

print("Final Predicted Salary:", round(salary, 2))


# Using model.predict()
prediction = model.predict([[Expe]])

print("Model Predicted Salary:", round(prediction[0], 2))


# Prediction for 20 years experience
prediction_20 = model.predict([[20]])

print("\nSalary for 20 Years Experience:", round(prediction_20[0], 2))
