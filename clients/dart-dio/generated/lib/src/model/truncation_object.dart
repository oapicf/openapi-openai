//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'truncation_object.g.dart';

/// Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
///
/// Properties:
/// * [type] - The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
/// * [lastMessages] - The number of most recent messages from the thread when constructing the context for the run.
@BuiltValue()
abstract class TruncationObject implements Built<TruncationObject, TruncationObjectBuilder> {
  /// The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
  @BuiltValueField(wireName: r'type')
  TruncationObjectTypeEnum get type;
  // enum typeEnum {  auto,  last_messages,  };

  /// The number of most recent messages from the thread when constructing the context for the run.
  @BuiltValueField(wireName: r'last_messages')
  int? get lastMessages;

  TruncationObject._();

  factory TruncationObject([void updates(TruncationObjectBuilder b)]) = _$TruncationObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TruncationObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TruncationObject> get serializer => _$TruncationObjectSerializer();
}

class _$TruncationObjectSerializer implements PrimitiveSerializer<TruncationObject> {
  @override
  final Iterable<Type> types = const [TruncationObject, _$TruncationObject];

  @override
  final String wireName = r'TruncationObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TruncationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(TruncationObjectTypeEnum),
    );
    if (object.lastMessages != null) {
      yield r'last_messages';
      yield serializers.serialize(
        object.lastMessages,
        specifiedType: const FullType.nullable(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TruncationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TruncationObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TruncationObjectTypeEnum),
          ) as TruncationObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'last_messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lastMessages = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TruncationObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TruncationObjectBuilder();
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

class TruncationObjectTypeEnum extends EnumClass {

  /// The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const TruncationObjectTypeEnum auto = _$truncationObjectTypeEnum_auto;
  /// The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
  @BuiltValueEnumConst(wireName: r'last_messages')
  static const TruncationObjectTypeEnum lastMessages = _$truncationObjectTypeEnum_lastMessages;

  static Serializer<TruncationObjectTypeEnum> get serializer => _$truncationObjectTypeEnumSerializer;

  const TruncationObjectTypeEnum._(String name): super(name);

  static BuiltSet<TruncationObjectTypeEnum> get values => _$truncationObjectTypeEnumValues;
  static TruncationObjectTypeEnum valueOf(String name) => _$truncationObjectTypeEnumValueOf(name);
}

