//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tuning_job_event.g.dart';

/// Fine-tuning job event object
///
/// Properties:
/// * [object] - The object type, which is always \"fine_tuning.job.event\".
/// * [id] - The object identifier.
/// * [createdAt] - The Unix timestamp (in seconds) for when the fine-tuning job was created.
/// * [level] - The log level of the event.
/// * [message] - The message of the event.
/// * [type] - The type of event.
/// * [data] - The data associated with the event.
@BuiltValue()
abstract class FineTuningJobEvent implements Built<FineTuningJobEvent, FineTuningJobEventBuilder> {
  /// The object type, which is always \"fine_tuning.job.event\".
  @BuiltValueField(wireName: r'object')
  FineTuningJobEventObjectEnum get object;
  // enum objectEnum {  fine_tuning.job.event,  };

  /// The object identifier.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The Unix timestamp (in seconds) for when the fine-tuning job was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The log level of the event.
  @BuiltValueField(wireName: r'level')
  FineTuningJobEventLevelEnum get level;
  // enum levelEnum {  info,  warn,  error,  };

  /// The message of the event.
  @BuiltValueField(wireName: r'message')
  String get message;

  /// The type of event.
  @BuiltValueField(wireName: r'type')
  FineTuningJobEventTypeEnum? get type;
  // enum typeEnum {  message,  metrics,  };

  /// The data associated with the event.
  @BuiltValueField(wireName: r'data')
  JsonObject? get data;

  FineTuningJobEvent._();

  factory FineTuningJobEvent([void updates(FineTuningJobEventBuilder b)]) = _$FineTuningJobEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuningJobEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuningJobEvent> get serializer => _$FineTuningJobEventSerializer();
}

class _$FineTuningJobEventSerializer implements PrimitiveSerializer<FineTuningJobEvent> {
  @override
  final Iterable<Type> types = const [FineTuningJobEvent, _$FineTuningJobEvent];

  @override
  final String wireName = r'FineTuningJobEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuningJobEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(FineTuningJobEventObjectEnum),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'level';
    yield serializers.serialize(
      object.level,
      specifiedType: const FullType(FineTuningJobEventLevelEnum),
    );
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(FineTuningJobEventTypeEnum),
      );
    }
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuningJobEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuningJobEventBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningJobEventObjectEnum),
          ) as FineTuningJobEventObjectEnum;
          result.object = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningJobEventLevelEnum),
          ) as FineTuningJobEventLevelEnum;
          result.level = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningJobEventTypeEnum),
          ) as FineTuningJobEventTypeEnum;
          result.type = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.data = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuningJobEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuningJobEventBuilder();
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

class FineTuningJobEventObjectEnum extends EnumClass {

  /// The object type, which is always \"fine_tuning.job.event\".
  @BuiltValueEnumConst(wireName: r'fine_tuning.job.event')
  static const FineTuningJobEventObjectEnum fineTuningPeriodJobPeriodEvent = _$fineTuningJobEventObjectEnum_fineTuningPeriodJobPeriodEvent;

  static Serializer<FineTuningJobEventObjectEnum> get serializer => _$fineTuningJobEventObjectEnumSerializer;

  const FineTuningJobEventObjectEnum._(String name): super(name);

  static BuiltSet<FineTuningJobEventObjectEnum> get values => _$fineTuningJobEventObjectEnumValues;
  static FineTuningJobEventObjectEnum valueOf(String name) => _$fineTuningJobEventObjectEnumValueOf(name);
}

class FineTuningJobEventLevelEnum extends EnumClass {

  /// The log level of the event.
  @BuiltValueEnumConst(wireName: r'info')
  static const FineTuningJobEventLevelEnum info = _$fineTuningJobEventLevelEnum_info;
  /// The log level of the event.
  @BuiltValueEnumConst(wireName: r'warn')
  static const FineTuningJobEventLevelEnum warn = _$fineTuningJobEventLevelEnum_warn;
  /// The log level of the event.
  @BuiltValueEnumConst(wireName: r'error')
  static const FineTuningJobEventLevelEnum error = _$fineTuningJobEventLevelEnum_error;

  static Serializer<FineTuningJobEventLevelEnum> get serializer => _$fineTuningJobEventLevelEnumSerializer;

  const FineTuningJobEventLevelEnum._(String name): super(name);

  static BuiltSet<FineTuningJobEventLevelEnum> get values => _$fineTuningJobEventLevelEnumValues;
  static FineTuningJobEventLevelEnum valueOf(String name) => _$fineTuningJobEventLevelEnumValueOf(name);
}

class FineTuningJobEventTypeEnum extends EnumClass {

  /// The type of event.
  @BuiltValueEnumConst(wireName: r'message')
  static const FineTuningJobEventTypeEnum message = _$fineTuningJobEventTypeEnum_message;
  /// The type of event.
  @BuiltValueEnumConst(wireName: r'metrics')
  static const FineTuningJobEventTypeEnum metrics = _$fineTuningJobEventTypeEnum_metrics;

  static Serializer<FineTuningJobEventTypeEnum> get serializer => _$fineTuningJobEventTypeEnumSerializer;

  const FineTuningJobEventTypeEnum._(String name): super(name);

  static BuiltSet<FineTuningJobEventTypeEnum> get values => _$fineTuningJobEventTypeEnumValues;
  static FineTuningJobEventTypeEnum valueOf(String name) => _$fineTuningJobEventTypeEnumValueOf(name);
}

