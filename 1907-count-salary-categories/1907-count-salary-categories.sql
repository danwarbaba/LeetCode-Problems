SELECT 'High Salary' AS category, COUNT(account_id) AS accounts_count
FROM Accounts
WHERE income > 50000

UNION ALL

SELECT 'Average Salary', COUNT(account_id)
from Accounts
WHERE income between 20000 AND 50000

UNION ALL

select 'Low Salary', COUNT(account_id)
FROM Accounts
WHERE income < 20000;