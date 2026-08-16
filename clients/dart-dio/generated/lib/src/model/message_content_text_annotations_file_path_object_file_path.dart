//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_text_annotations_file_path_object_file_path.g.dart';

/// MessageContentTextAnnotationsFilePathObjectFilePath
///
/// Properties:
/// * [fileId] - The ID of the file that was generated.
@BuiltValue()
abstract class MessageContentTextAnnotationsFilePathObjectFilePath implements Built<MessageContentTextAnnotationsFilePathObjectFilePath, MessageContentTextAnnotationsFilePathObjectFilePathBuilder> {
  /// The ID of the file that was generated.
  @BuiltValueField(wireName: r'file_id')
  String get fileId;

  MessageContentTextAnnotationsFilePathObjectFilePath._();

  factory MessageContentTextAnnotationsFilePathObjectFilePath([void updates(MessageContentTextAnnotationsFilePathObjectFilePathBuilder b)]) = _$MessageContentTextAnnotationsFilePathObjectFilePath;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentTextAnnotationsFilePathObjectFilePathBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentTextAnnotationsFilePathObjectFilePath> get serializer => _$MessageContentTextAnnotationsFilePathObjectFilePathSerializer();
}

class _$MessageContentTextAnnotationsFilePathObjectFilePathSerializer implements PrimitiveSerializer<MessageContentTextAnnotationsFilePathObjectFilePath> {
  @override
  final Iterable<Type> types = const [MessageContentTextAnnotationsFilePathObjectFilePath, _$MessageContentTextAnnotationsFilePathObjectFilePath];

  @override
  final String wireName = r'MessageContentTextAnnotationsFilePathObjectFilePath';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentTextAnnotationsFilePathObjectFilePath object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'file_id';
    yield serializers.serialize(
      object.fileId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentTextAnnotationsFilePathObjectFilePath object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentTextAnnotationsFilePathObjectFilePathBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'file_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fileId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageContentTextAnnotationsFilePathObjectFilePath deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentTextAnnotationsFilePathObjectFilePathBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

