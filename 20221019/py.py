# import fibo
# fibo.fib(8)
# fibo.fib2(8)

# a = [[9, 9], [0, 4], [2, 3]]
# for x, y in a:
#     print(x,y)

# a = [['도윤', 21], ['하준', 20], ['시우', 22]]
# for x, y in a:
#     print(x, ':', y, '세')

# text = "AI! 나는 인공지능 로봇 입니다. 나는 'AI 로봇' 입니다."
# def max_counts(text):
#     counts = {}
#     for i in text.split(' '):
#         if i in counts:
#             counts[i] += 1
#         else:
#             counts[i] = 1
#     return counts
# max_counts(text)

# text = "AI! 나는 인공지능 로봇 입니다. 나는 'AI 로봇' 입니다."
# def max_counts(text):
#     skips = ['.', ',', ';', ':', "'", '!']
#     for ch in skips:
#         text = text.replace(ch. '')
#     counts = {}
#     for i in text.split(' '):
#         if i in counts:
#             counts[i] += 1
#         else:
#             counts[i] = 1
#     return counts
# max_counts(text)

# people = ['홍', '이', '김', '이', '이', '김']
# def max_counts(people):
#     counts = {}
#     for i in people:
#         if i in counts:
#             counts[i] += 1
#         else:
#             counts[i] = 1
#     return counts
# counts = max_counts(people)
# print(counts)

# f = open('data1.txt','r', encoding='utf-8')
# data1 = f.read()
# print(data1)
# f.close()

# f = open('data1.csv','r')
# data1 = f.read()
# print(data1)
# f.close()

# import csv
# f = open('data1.csv','r')
# data = csv.reader(f)
# print(type(data))
# for i in data:
#     print(i)

# from msilib import sequence

# f = open("NM_207618.2.fasta","r")
# sequence = f.read
# sequence

# with open("NM_207618.2.fasta","r") as inf:
#     data = inf.read().splitlines(True)
# with open('dna1.txt','w') as outf:
#     outf.writelines(data[1:])
# f = open("dna1.txt","r")
# sequence = f.read()
# sequence

from msilib import sequence


# genetic_code = {
# 'ATA':'I', 'ATC':'I', 'ATT':'I', 'ATG':'M',
# 'ACA':'T', 'ACC':'T', 'ACG':'T', 'ACT':'T',
# 'AAC':'N', 'AAT':'N', 'AAA':'K', 'AAG':'K',
# 'AGC':'S', 'AGT':'S', 'AGA':'R', 'AGG':'R',
# 'CTA':'L', 'CTC':'L', 'CTG':'L', 'CTT':'L',
# 'CCA':'P', 'CCC':'P', 'CCG':'P', 'CCT':'P',
# 'CAC':'H', 'CAT':'H', 'CAA':'Q', 'CAG':'Q',
# 'CGA':'R', 'CGC':'R', 'CGG':'R', 'CGT':'R',
# 'GTA':'V', 'GTC':'V', 'GTG':'V', 'GTT':'V',
# 'GCA':'A', 'GCC':'A', 'GCG':'A', 'GCT':'A',
# 'GAC':'D', 'GAT':'D', 'GAA':'E', 'GAG':'E',
# 'GGA':'G', 'GGC':'G', 'GGG':'G', 'GGT':'G',
# 'TCA':'S', 'TCC':'S', 'TCG':'S', 'TCT':'S',
# 'TTC':'F', 'TTT':'F', 'TTA':'L', 'TTG':'L',
# 'TAC':'Y', 'TAT':'Y', 'TAA':'_', 'TAG':'_',
# 'TGC':'C', 'TGT':'C', 'TGA':'_', 'TGG':'W',
# }
# genetic_code = ['ATA']

def read_seq(inputfile):
    with open(inputfile, 'r') as f:
        sequence = f.read()
    sequence = sequence.replace(' ', '')
    sequence = sequence.replace('\n', '')
    sequence = sequence.replace('\r', '')
    return sequence
with open('NM_207618.2.fasta', 'r') as inf:
    data = inf.read().splitlines(True)
with open('dna.txt', 'w') as outf:
    outf.writelines(data[1:])
dna = read_seq('dna.txt')

def convert(seq):
    """DNA 시퀀스를 아미노산 시퀀스로 변환"""
    genetic_code = {
'ATA':'I', 'ATC':'I', 'ATT':'I', 'ATG':'M',
'ACA':'T', 'ACC':'T', 'ACG':'T', 'ACT':'T',
'AAC':'N', 'AAT':'N', 'AAA':'K', 'AAG':'K',
'AGC':'S', 'AGT':'S', 'AGA':'R', 'AGG':'R',
'CTA':'L', 'CTC':'L', 'CTG':'L', 'CTT':'L',
'CCA':'P', 'CCC':'P', 'CCG':'P', 'CCT':'P',
'CAC':'H', 'CAT':'H', 'CAA':'Q', 'CAG':'Q',
'CGA':'R', 'CGC':'R', 'CGG':'R', 'CGT':'R',
'GTA':'V', 'GTC':'V', 'GTG':'V', 'GTT':'V',
'GCA':'A', 'GCC':'A', 'GCG':'A', 'GCT':'A',
'GAC':'D', 'GAT':'D', 'GAA':'E', 'GAG':'E',
'GGA':'G', 'GGC':'G', 'GGG':'G', 'GGT':'G',
'TCA':'S', 'TCC':'S', 'TCG':'S', 'TCT':'S',
'TTC':'F', 'TTT':'F', 'TTA':'L', 'TTG':'L',
'TAC':'Y', 'TAT':'Y', 'TAA':'_', 'TAG':'_',
'TGC':'C', 'TGT':'C', 'TGA':'_', 'TGG':'W',
}
    protein = ""
    if len(seq) % 3 == 0:
        for i in range(0, len(seq), 3):
            codon = seq[i : i+3]
            protein += genetic_code[codon]
        return protein
print(convert(dna[20:935]))