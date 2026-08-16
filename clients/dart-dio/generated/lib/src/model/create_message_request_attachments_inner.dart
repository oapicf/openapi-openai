//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_message_request_attachments_inner_tools_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_message_request_attachments_inner.g.dart';

/// CreateMessageRequestAttachmentsInner
///
/// Properties:
/// * [fileId] - The ID of the file to attach to the message.
/// * [tools] - The tools to add this file to.
@BuiltValue()
abstract class CreateMessageRequestAttachmentsInner implements Built<CreateMessageRequestAttachmentsInner, CreateMessageRequestAttachmentsInnerBuilder> {
  /// The ID of the file to attach to the message.
  @BuiltValueField(wireName: r'file_id')
  String? get fileId;

  /// The tools to add this file to.
  @BuiltValueField(wireName: r'tools')
  BuiltList<CreateMessageRequestAttachmentsInnerToolsInner>? get tools;

  CreateMessageRequestAttachmentsInner._();

  factory CreateMessageRequestAttachmentsInner([void updates(CreateMessageRequestAttachmentsInnerBuilder b)]) = _$CreateMessageRequestAttachmentsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateMessageRequestAttachmentsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateMessageRequestAttachmentsInner> get serializer => _$CreateMessageRequestAttachmentsInnerSerializer();
}

class _$CreateMessageRequestAttachmentsInnerSerializer implements PrimitiveSerializer<CreateMessageRequestAttachmentsInner> {
  @override
  final Iterable<Type> types = const [CreateMessageRequestAttachmentsInner, _$CreateMessageRequestAttachmentsInner];

  @override
  final String wireName = r'CreateMessageRequestAttachmentsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateMessageRequestAttachmentsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fileId != null) {
      yield r'file_id';
      yield serializers.serialize(
        object.fileId,
        specifiedType: const FullType(String),
      );
    }
    if (object.tools != null) {
      yield r'tools';
      yield serializers.serialize(
        object.tools,
        specifiedType: const FullType(BuiltList, [FullType(CreateMessageRequestAttachmentsInnerToolsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateMessageRequestAttachmentsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateMessageRequestAttachmentsInnerBuilder result,
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
        case r'tools':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateMessageRequestAttachmentsInnerToolsInner)]),
          ) as BuiltList<CreateMessageRequestAttachmentsInnerToolsInner>;
          result.tools.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateMessageRequestAttachmentsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateMessageRequestAttachmentsInnerBuilder();
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

