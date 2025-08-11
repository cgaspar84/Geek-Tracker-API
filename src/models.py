from enum import Enum
from pydantic import BaseModel, Field, HttpUrl


class Category(str, Enum):
    VIDEO_GAMES = "video_games"
    BOOKS = "books"
    MOVIES = "movies"
    RETRO_HARDWARE = "retro_hardware"


class Item(BaseModel):
    title: str = Field(..., description="Title of the item")
    year: int = Field(..., description="Release or publication year")
    category: Category = Field(..., description="Type of collection item")
    personal_rating: float = Field(ge=0, le=5, description="Personal rating from 0 to 5")
    image_url: HttpUrl = Field(..., description="URL of the item's image")
