//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/batch_request_counts.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/batch_errors.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch.g.dart';

/// Batch
///
/// Properties:
/// * [id] 
/// * [object] - The object type, which is always `batch`.
/// * [endpoint] - The OpenAI API endpoint used by the batch.
/// * [errors] 
/// * [inputFileId] - The ID of the input file for the batch.
/// * [completionWindow] - The time frame within which the batch should be processed.
/// * [status] - The current status of the batch.
/// * [outputFileId] - The ID of the file containing the outputs of successfully executed requests.
/// * [errorFileId] - The ID of the file containing the outputs of requests with errors.
/// * [createdAt] - The Unix timestamp (in seconds) for when the batch was created.
/// * [inProgressAt] - The Unix timestamp (in seconds) for when the batch started processing.
/// * [expiresAt] - The Unix timestamp (in seconds) for when the batch will expire.
/// * [finalizingAt] - The Unix timestamp (in seconds) for when the batch started finalizing.
/// * [completedAt] - The Unix timestamp (in seconds) for when the batch was completed.
/// * [failedAt] - The Unix timestamp (in seconds) for when the batch failed.
/// * [expiredAt] - The Unix timestamp (in seconds) for when the batch expired.
/// * [cancellingAt] - The Unix timestamp (in seconds) for when the batch started cancelling.
/// * [cancelledAt] - The Unix timestamp (in seconds) for when the batch was cancelled.
/// * [requestCounts] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
@BuiltValue()
abstract class Batch implements Built<Batch, BatchBuilder> {
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `batch`.
  @BuiltValueField(wireName: r'object')
  BatchObjectEnum get object;
  // enum objectEnum {  batch,  };

  /// The OpenAI API endpoint used by the batch.
  @BuiltValueField(wireName: r'endpoint')
  String get endpoint;

  @BuiltValueField(wireName: r'errors')
  BatchErrors? get errors;

  /// The ID of the input file for the batch.
  @BuiltValueField(wireName: r'input_file_id')
  String get inputFileId;

  /// The time frame within which the batch should be processed.
  @BuiltValueField(wireName: r'completion_window')
  String get completionWindow;

  /// The current status of the batch.
  @BuiltValueField(wireName: r'status')
  BatchStatusEnum get status;
  // enum statusEnum {  validating,  failed,  in_progress,  finalizing,  completed,  expired,  cancelling,  cancelled,  };

  /// The ID of the file containing the outputs of successfully executed requests.
  @BuiltValueField(wireName: r'output_file_id')
  String? get outputFileId;

  /// The ID of the file containing the outputs of requests with errors.
  @BuiltValueField(wireName: r'error_file_id')
  String? get errorFileId;

  /// The Unix timestamp (in seconds) for when the batch was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The Unix timestamp (in seconds) for when the batch started processing.
  @BuiltValueField(wireName: r'in_progress_at')
  int? get inProgressAt;

  /// The Unix timestamp (in seconds) for when the batch will expire.
  @BuiltValueField(wireName: r'expires_at')
  int? get expiresAt;

  /// The Unix timestamp (in seconds) for when the batch started finalizing.
  @BuiltValueField(wireName: r'finalizing_at')
  int? get finalizingAt;

  /// The Unix timestamp (in seconds) for when the batch was completed.
  @BuiltValueField(wireName: r'completed_at')
  int? get completedAt;

  /// The Unix timestamp (in seconds) for when the batch failed.
  @BuiltValueField(wireName: r'failed_at')
  int? get failedAt;

  /// The Unix timestamp (in seconds) for when the batch expired.
  @BuiltValueField(wireName: r'expired_at')
  int? get expiredAt;

  /// The Unix timestamp (in seconds) for when the batch started cancelling.
  @BuiltValueField(wireName: r'cancelling_at')
  int? get cancellingAt;

  /// The Unix timestamp (in seconds) for when the batch was cancelled.
  @BuiltValueField(wireName: r'cancelled_at')
  int? get cancelledAt;

  @BuiltValueField(wireName: r'request_counts')
  BatchRequestCounts? get requestCounts;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  Batch._();

  factory Batch([void updates(BatchBuilder b)]) = _$Batch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BatchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Batch> get serializer => _$BatchSerializer();
}

class _$BatchSerializer implements PrimitiveSerializer<Batch> {
  @override
  final Iterable<Type> types = const [Batch, _$Batch];

  @override
  final String wireName = r'Batch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Batch object, {
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
      specifiedType: const FullType(BatchObjectEnum),
    );
    yield r'endpoint';
    yield serializers.serialize(
      object.endpoint,
      specifiedType: const FullType(String),
    );
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BatchErrors),
      );
    }
    yield r'input_file_id';
    yield serializers.serialize(
      object.inputFileId,
      specifiedType: const FullType(String),
    );
    yield r'completion_window';
    yield serializers.serialize(
      object.completionWindow,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(BatchStatusEnum),
    );
    if (object.outputFileId != null) {
      yield r'output_file_id';
      yield serializers.serialize(
        object.outputFileId,
        specifiedType: const FullType(String),
      );
    }
    if (object.errorFileId != null) {
      yield r'error_file_id';
      yield serializers.serialize(
        object.errorFileId,
        specifiedType: const FullType(String),
      );
    }
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    if (object.inProgressAt != null) {
      yield r'in_progress_at';
      yield serializers.serialize(
        object.inProgressAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.expiresAt != null) {
      yield r'expires_at';
      yield serializers.serialize(
        object.expiresAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.finalizingAt != null) {
      yield r'finalizing_at';
      yield serializers.serialize(
        object.finalizingAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.completedAt != null) {
      yield r'completed_at';
      yield serializers.serialize(
        object.completedAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.failedAt != null) {
      yield r'failed_at';
      yield serializers.serialize(
        object.failedAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.expiredAt != null) {
      yield r'expired_at';
      yield serializers.serialize(
        object.expiredAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.cancellingAt != null) {
      yield r'cancelling_at';
      yield serializers.serialize(
        object.cancellingAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.cancelledAt != null) {
      yield r'cancelled_at';
      yield serializers.serialize(
        object.cancelledAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.requestCounts != null) {
      yield r'request_counts';
      yield serializers.serialize(
        object.requestCounts,
        specifiedType: const FullType(BatchRequestCounts),
      );
    }
    if (object.metadata != null) {
      yield r'metadata';
      yield serializers.serialize(
        object.metadata,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Batch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BatchBuilder result,
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
            specifiedType: const FullType(BatchObjectEnum),
          ) as BatchObjectEnum;
          result.object = valueDes;
          break;
        case r'endpoint':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endpoint = valueDes;
          break;
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BatchErrors),
          ) as BatchErrors;
          result.errors.replace(valueDes);
          break;
        case r'input_file_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.inputFileId = valueDes;
          break;
        case r'completion_window':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.completionWindow = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BatchStatusEnum),
          ) as BatchStatusEnum;
          result.status = valueDes;
          break;
        case r'output_file_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.outputFileId = valueDes;
          break;
        case r'error_file_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.errorFileId = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'in_progress_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.inProgressAt = valueDes;
          break;
        case r'expires_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.expiresAt = valueDes;
          break;
        case r'finalizing_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.finalizingAt = valueDes;
          break;
        case r'completed_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.completedAt = valueDes;
          break;
        case r'failed_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.failedAt = valueDes;
          break;
        case r'expired_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.expiredAt = valueDes;
          break;
        case r'cancelling_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.cancellingAt = valueDes;
          break;
        case r'cancelled_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.cancelledAt = valueDes;
          break;
        case r'request_counts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BatchRequestCounts),
          ) as BatchRequestCounts;
          result.requestCounts.replace(valueDes);
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.metadata = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Batch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BatchBuilder();
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

class BatchObjectEnum extends EnumClass {

  /// The object type, which is always `batch`.
  @BuiltValueEnumConst(wireName: r'batch')
  static const BatchObjectEnum batch = _$batchObjectEnum_batch;

  static Serializer<BatchObjectEnum> get serializer => _$batchObjectEnumSerializer;

  const BatchObjectEnum._(String name): super(name);

  static BuiltSet<BatchObjectEnum> get values => _$batchObjectEnumValues;
  static BatchObjectEnum valueOf(String name) => _$batchObjectEnumValueOf(name);
}

class BatchStatusEnum extends EnumClass {

  /// The current status of the batch.
  @BuiltValueEnumConst(wireName: r'validating')
  static const BatchStatusEnum validating = _$batchStatusEnum_validating;
  /// The current status of the batch.
  @BuiltValueEnumConst(wireName: r'failed')
  static const BatchStatusEnum failed = _$batchStatusEnum_failed;
  /// The current status of the batch.
  @BuiltValueEnumConst(wireName: r'in_progress')
  static const BatchStatusEnum inProgress = _$batchStatusEnum_inProgress;
  /// The current status of the batch.
  @BuiltValueEnumConst(wireName: r'finalizing')
  static const BatchStatusEnum finalizing = _$batchStatusEnum_finalizing;
  /// The current status of the batch.
  @BuiltValueEnumConst(wireName: r'completed')
  static const BatchStatusEnum completed = _$batchStatusEnum_completed;
  /// The current status of the batch.
  @BuiltValueEnumConst(wireName: r'expired')
  static const BatchStatusEnum expired = _$batchStatusEnum_expired;
  /// The current status of the batch.
  @BuiltValueEnumConst(wireName: r'cancelling')
  static const BatchStatusEnum cancelling = _$batchStatusEnum_cancelling;
  /// The current status of the batch.
  @BuiltValueEnumConst(wireName: r'cancelled')
  static const BatchStatusEnum cancelled = _$batchStatusEnum_cancelled;

  static Serializer<BatchStatusEnum> get serializer => _$batchStatusEnumSerializer;

  const BatchStatusEnum._(String name): super(name);

  static BuiltSet<BatchStatusEnum> get values => _$batchStatusEnumValues;
  static BatchStatusEnum valueOf(String name) => _$batchStatusEnumValueOf(name);
}

