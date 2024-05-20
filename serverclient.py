import pytest
from docx import Document

def function():
    doc  = Document("sample.docx")
    exp = ["important","pytest","test"]
    for keyword in exp:
        assert any(keyword.lower() in para.text.lower() for para in doc.paragraphs), f"Keyword f'{keyword}' not found"