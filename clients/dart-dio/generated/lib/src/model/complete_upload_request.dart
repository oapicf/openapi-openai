//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'complete_upload_request.g.dart';

/// CompleteUploadRequest
///
/// Properties:
/// * [partIds] - The ordered list of Part IDs. 
/// * [md5] - The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
@BuiltValue()
abstract class CompleteUploadRequest implements Built<CompleteUploadRequest, CompleteUploadRequestBuilder> {
  /// The ordered list of Part IDs. 
  @BuiltValueField(wireName: r'part_ids')
  BuiltList<String> get partIds;

  /// The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
  @BuiltValueField(wireName: r'md5')
  String? get md5;

  CompleteUploadRequest._();

  factory CompleteUploadRequest([void updates(CompleteUploadRequestBuilder b)]) = _$CompleteUploadRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CompleteUploadRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CompleteUploadRequest> get serializer => _$CompleteUploadRequestSerializer();
}

class _$CompleteUploadRequestSerializer implements PrimitiveSerializer<CompleteUploadRequest> {
  @override
  final Iterable<Type> types = const [CompleteUploadRequest, _$CompleteUploadRequest];

  @override
  final String wireName = r'CompleteUploadRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CompleteUploadRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'part_ids';
    yield serializers.serialize(
      object.partIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    if (object.md5 != null) {
      yield r'md5';
      yield serializers.serialize(
        object.md5,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CompleteUploadRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CompleteUploadRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'part_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.partIds.replace(valueDes);
          break;
        case r'md5':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.md5 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CompleteUploadRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CompleteUploadRequestBuilder();
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

