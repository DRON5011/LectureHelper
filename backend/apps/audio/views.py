from rest_framework.views import APIView
from rest_framework.parsers import MultiPartParser
from rest_framework.response import Response
from .models import Audio

class UploadAudioView(APIView):
    parser_classes = [MultiPartParser]

    def post(self, request):
        file = request.FILES['file']
        lecture_id = request.data.get('lecture_id')

        audio = Audio.objects.create(
            file=file,
            lecture_id=lecture_id
        )
        return Response({'id': audio.id})