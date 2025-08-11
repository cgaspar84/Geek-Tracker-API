from src.models import Category, Item


def test_create_item():
    item = Item(
        title="The Legend of Code",
        year=2021,
        category=Category.VIDEO_GAMES,
        personal_rating=4.5,
        image_url="https://example.com/image.png",
    )

    assert item.title == "The Legend of Code"
    assert item.year == 2021
    assert item.category == Category.VIDEO_GAMES
    assert item.personal_rating == 4.5
