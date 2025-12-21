package org.example;

/**
 * Used to calculate Grade for students based on their marks.
 * Mark 90 - 100 : Grade A
 * Mark 80 - 89 : Grade B
 * Mark 70 - 79 : Grade C
 * Mark 60 - 69 : Grade D
 * Mark 0 - 59 : Grade F
 * Constraints: mark <0 and >100 is invalid input
 */

public class GradeCalculator {

    public static void main(String[] args) {
        int studentMark = 10;
        char grade = '-';

//        if (studentMark >= 90 && studentMark <= 100) {
//            grade = 'A';
//        } else if (studentMark >= 80 && studentMark <= 89) {
//            grade = 'B';
//        } else if (studentMark >= 70 && studentMark <= 79) {
//            grade = 'C';
//        } else if (studentMark >= 60 && studentMark <= 69) {
//            grade = 'D';
//        } else if (studentMark >= 0 && studentMark <= 59) {
//            grade = 'F';
//        } else {
//            System.out.println("Invalid Student mark!");
//        }



        if(studentMark>0 && studentMark<100) {
            switch (studentMark) {
                case 100:
                case 99:
                case 98:
                case 97:
                case 96:
                case 95:
                case 94:
                case 93:
                case 92:
                case 91:
                case 90:
                    grade = 'A';
                    break;

                case 89:
                case 88:
                case 87:
                case 86:
                case 85:
                case 84:
                case 83:
                case 82:
                case 81:
                case 80:
                    grade = 'B';
                    break;

                case 79:
                case 78:
                case 77:
                case 76:
                case 75:
                case 74:
                case 73:
                case 72:
                case 71:
                case 70:
                    grade = 'C';
                    break;

                case 69:
                case 68:
                case 67:
                case 66:
                case 65:
                case 64:
                case 63:
                case 62:
                case 61:
                case 60:
                    grade = 'D';
                    break;

                default:
                    grade = 'F';
            }

            System.out.println("Student Mark : " + studentMark + " & Student Grade : " + grade);
        }
        else
            System.out.println("Invalid Student mark!");

    }
}
