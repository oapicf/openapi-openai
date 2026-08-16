//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_object_last_error.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_object_step_details.dart';
import 'package:openapi/src/model/run_step_completion_usage.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_object.g.dart';

/// Represents a step in execution of a run. 
///
/// Properties:
/// * [id] - The identifier of the run step, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `thread.run.step`.
/// * [createdAt] - The Unix timestamp (in seconds) for when the run step was created.
/// * [assistantId] - The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
/// * [threadId] - The ID of the [thread](/docs/api-reference/threads) that was run.
/// * [runId] - The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
/// * [type] - The type of run step, which can be either `message_creation` or `tool_calls`.
/// * [status] - The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
/// * [stepDetails] 
/// * [lastError] 
/// * [expiredAt] - The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
/// * [cancelledAt] - The Unix timestamp (in seconds) for when the run step was cancelled.
/// * [failedAt] - The Unix timestamp (in seconds) for when the run step failed.
/// * [completedAt] - The Unix timestamp (in seconds) for when the run step completed.
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
/// * [usage] 
@BuiltValue()
abstract class RunStepObject implements Built<RunStepObject, RunStepObjectBuilder> {
  /// The identifier of the run step, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `thread.run.step`.
  @BuiltValueField(wireName: r'object')
  RunStepObjectObjectEnum get object;
  // enum objectEnum {  thread.run.step,  };

  /// The Unix timestamp (in seconds) for when the run step was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
  @BuiltValueField(wireName: r'assistant_id')
  String get assistantId;

  /// The ID of the [thread](/docs/api-reference/threads) that was run.
  @BuiltValueField(wireName: r'thread_id')
  String get threadId;

  /// The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
  @BuiltValueField(wireName: r'run_id')
  String get runId;

  /// The type of run step, which can be either `message_creation` or `tool_calls`.
  @BuiltValueField(wireName: r'type')
  RunStepObjectTypeEnum get type;
  // enum typeEnum {  message_creation,  tool_calls,  };

  /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  @BuiltValueField(wireName: r'status')
  RunStepObjectStatusEnum get status;
  // enum statusEnum {  in_progress,  cancelled,  failed,  completed,  expired,  };

  @BuiltValueField(wireName: r'step_details')
  RunStepObjectStepDetails get stepDetails;

  @BuiltValueField(wireName: r'last_error')
  RunStepObjectLastError? get lastError;

  /// The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
  @BuiltValueField(wireName: r'expired_at')
  int? get expiredAt;

  /// The Unix timestamp (in seconds) for when the run step was cancelled.
  @BuiltValueField(wireName: r'cancelled_at')
  int? get cancelledAt;

  /// The Unix timestamp (in seconds) for when the run step failed.
  @BuiltValueField(wireName: r'failed_at')
  int? get failedAt;

  /// The Unix timestamp (in seconds) for when the run step completed.
  @BuiltValueField(wireName: r'completed_at')
  int? get completedAt;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  @BuiltValueField(wireName: r'usage')
  RunStepCompletionUsage? get usage;

  RunStepObject._();

  factory RunStepObject([void updates(RunStepObjectBuilder b)]) = _$RunStepObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepObject> get serializer => _$RunStepObjectSerializer();
}

class _$RunStepObjectSerializer implements PrimitiveSerializer<RunStepObject> {
  @override
  final Iterable<Type> types = const [RunStepObject, _$RunStepObject];

  @override
  final String wireName = r'RunStepObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(RunStepObjectObjectEnum),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'assistant_id';
    yield serializers.serialize(
      object.assistantId,
      specifiedType: const FullType(String),
    );
    yield r'thread_id';
    yield serializers.serialize(
      object.threadId,
      specifiedType: const FullType(String),
    );
    yield r'run_id';
    yield serializers.serialize(
      object.runId,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepObjectTypeEnum),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(RunStepObjectStatusEnum),
    );
    yield r'step_details';
    yield serializers.serialize(
      object.stepDetails,
      specifiedType: const FullType(RunStepObjectStepDetails),
    );
    yield r'last_error';
    yield object.lastError == null ? null : serializers.serialize(
      object.lastError,
      specifiedType: const FullType.nullable(RunStepObjectLastError),
    );
    yield r'expired_at';
    yield object.expiredAt == null ? null : serializers.serialize(
      object.expiredAt,
      specifiedType: const FullType.nullable(int),
    );
    yield r'cancelled_at';
    yield object.cancelledAt == null ? null : serializers.serialize(
      object.cancelledAt,
      specifiedType: const FullType.nullable(int),
    );
    yield r'failed_at';
    yield object.failedAt == null ? null : serializers.serialize(
      object.failedAt,
      specifiedType: const FullType.nullable(int),
    );
    yield r'completed_at';
    yield object.completedAt == null ? null : serializers.serialize(
      object.completedAt,
      specifiedType: const FullType.nullable(int),
    );
    yield r'metadata';
    yield object.metadata == null ? null : serializers.serialize(
      object.metadata,
      specifiedType: const FullType.nullable(JsonObject),
    );
    yield r'usage';
    yield object.usage == null ? null : serializers.serialize(
      object.usage,
      specifiedType: const FullType.nullable(RunStepCompletionUsage),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepObjectObjectEnum),
          ) as RunStepObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'assistant_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assistantId = valueDes;
          break;
        case r'thread_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.threadId = valueDes;
          break;
        case r'run_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.runId = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepObjectTypeEnum),
          ) as RunStepObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepObjectStatusEnum),
          ) as RunStepObjectStatusEnum;
          result.status = valueDes;
          break;
        case r'step_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepObjectStepDetails),
          ) as RunStepObjectStepDetails;
          result.stepDetails.replace(valueDes);
          break;
        case r'last_error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(RunStepObjectLastError),
          ) as RunStepObjectLastError?;
          if (valueDes == null) continue;
          result.lastError.replace(valueDes);
          break;
        case r'expired_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.expiredAt = valueDes;
          break;
        case r'cancelled_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.cancelledAt = valueDes;
          break;
        case r'failed_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.failedAt = valueDes;
          break;
        case r'completed_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.completedAt = valueDes;
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.metadata = valueDes;
          break;
        case r'usage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(RunStepCompletionUsage),
          ) as RunStepCompletionUsage?;
          if (valueDes == null) continue;
          result.usage.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepObjectBuilder();
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

class RunStepObjectObjectEnum extends EnumClass {

  /// The object type, which is always `thread.run.step`.
  @BuiltValueEnumConst(wireName: r'thread.run.step')
  static const RunStepObjectObjectEnum threadPeriodRunPeriodStep = _$runStepObjectObjectEnum_threadPeriodRunPeriodStep;

  static Serializer<RunStepObjectObjectEnum> get serializer => _$runStepObjectObjectEnumSerializer;

  const RunStepObjectObjectEnum._(String name): super(name);

  static BuiltSet<RunStepObjectObjectEnum> get values => _$runStepObjectObjectEnumValues;
  static RunStepObjectObjectEnum valueOf(String name) => _$runStepObjectObjectEnumValueOf(name);
}

class RunStepObjectTypeEnum extends EnumClass {

  /// The type of run step, which can be either `message_creation` or `tool_calls`.
  @BuiltValueEnumConst(wireName: r'message_creation')
  static const RunStepObjectTypeEnum messageCreation = _$runStepObjectTypeEnum_messageCreation;
  /// The type of run step, which can be either `message_creation` or `tool_calls`.
  @BuiltValueEnumConst(wireName: r'tool_calls')
  static const RunStepObjectTypeEnum toolCalls = _$runStepObjectTypeEnum_toolCalls;

  static Serializer<RunStepObjectTypeEnum> get serializer => _$runStepObjectTypeEnumSerializer;

  const RunStepObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepObjectTypeEnum> get values => _$runStepObjectTypeEnumValues;
  static RunStepObjectTypeEnum valueOf(String name) => _$runStepObjectTypeEnumValueOf(name);
}

class RunStepObjectStatusEnum extends EnumClass {

  /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  @BuiltValueEnumConst(wireName: r'in_progress')
  static const RunStepObjectStatusEnum inProgress = _$runStepObjectStatusEnum_inProgress;
  /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  @BuiltValueEnumConst(wireName: r'cancelled')
  static const RunStepObjectStatusEnum cancelled = _$runStepObjectStatusEnum_cancelled;
  /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  @BuiltValueEnumConst(wireName: r'failed')
  static const RunStepObjectStatusEnum failed = _$runStepObjectStatusEnum_failed;
  /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  @BuiltValueEnumConst(wireName: r'completed')
  static const RunStepObjectStatusEnum completed = _$runStepObjectStatusEnum_completed;
  /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  @BuiltValueEnumConst(wireName: r'expired')
  static const RunStepObjectStatusEnum expired = _$runStepObjectStatusEnum_expired;

  static Serializer<RunStepObjectStatusEnum> get serializer => _$runStepObjectStatusEnumSerializer;

  const RunStepObjectStatusEnum._(String name): super(name);

  static BuiltSet<RunStepObjectStatusEnum> get values => _$runStepObjectStatusEnumValues;
  static RunStepObjectStatusEnum valueOf(String name) => _$runStepObjectStatusEnumValueOf(name);
}

