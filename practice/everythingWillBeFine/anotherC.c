// def minimumCycles2(arr):
//     maximum1_lst = [max(arr)] * len(arr)
//     maximum2_lst = [max(arr)+1] * len(arr)

//     count1 = 0
//     count1_dict = {0:-1,1:0,2:0}
//     for i in range(0, len(maximum1_lst)):
//         count1 += (maximum1_lst[i] - arr[i]) // 3 * 2
//         maximum1_lst[i] = (maximum1_lst[i] - arr[i]) % 3

//         if maximum1_lst[i] == 0:
//             count1_dict[0] += 1
//         elif maximum1_lst[i] == 1:
//             count1_dict[1] += 1
//         else:
//             count1_dict[2] += 1

//     count2 = 0
//     count2_dict = {0:0,1:0,2:0}
//     for i in range(0, len(maximum2_lst)):
//         count2 += (maximum2_lst[i] - arr[i]) // 3 * 2
//         maximum2_lst[i] = (maximum2_lst[i] - arr[i]) % 3

//         if maximum2_lst[i] == 0:
//             count2_dict[0] += 1
//         elif maximum2_lst[i] == 1:
//             count2_dict[1] += 1
//         else:
//             count2_dict[2] += 1

//     print(maximum1_lst,count1,count1_dict)
//     print(maximum2_lst,count2,count2_dict)
