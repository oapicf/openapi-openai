//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_object_content_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_message_request_attachments_inner.dart';
import 'package:openapi/src/model/message_object_incomplete_details.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_object.g.dart';

/// Represents a message within a [thread](/docs/api-reference/threads).
///
/// Properties:
/// * [id] - The identifier, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `thread.message`.
/// * [createdAt] - The Unix timestamp (in seconds) for when the message was created.
/// * [threadId] - The [thread](/docs/api-reference/threads) ID that this message belongs to.
/// * [status] - The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
/// * [incompleteDetails] 
/// * [completedAt] - The Unix timestamp (in seconds) for when the message was completed.
/// * [incompleteAt] - The Unix timestamp (in seconds) for when the message was marked as incomplete.
/// * [role] - The entity that produced the message. One of `user` or `assistant`.
/// * [content] - The content of the message in array of text and/or images.
/// * [assistantId] - If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
/// * [runId] - The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
/// * [attachments] - A list of files attached to the message, and the tools they were added to.
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
@BuiltValue()
abstract class MessageObject implements Built<MessageObject, MessageObjectBuilder> {
  /// The identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `thread.message`.
  @BuiltValueField(wireName: r'object')
  MessageObjectObjectEnum get object;
  // enum objectEnum {  thread.message,  };

  /// The Unix timestamp (in seconds) for when the message was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The [thread](/docs/api-reference/threads) ID that this message belongs to.
  @BuiltValueField(wireName: r'thread_id')
  String get threadId;

  /// The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
  @BuiltValueField(wireName: r'status')
  MessageObjectStatusEnum get status;
  // enum statusEnum {  in_progress,  incomplete,  completed,  };

  @BuiltValueField(wireName: r'incomplete_details')
  MessageObjectIncompleteDetails? get incompleteDetails;

  /// The Unix timestamp (in seconds) for when the message was completed.
  @BuiltValueField(wireName: r'completed_at')
  int? get completedAt;

  /// The Unix timestamp (in seconds) for when the message was marked as incomplete.
  @BuiltValueField(wireName: r'incomplete_at')
  int? get incompleteAt;

  /// The entity that produced the message. One of `user` or `assistant`.
  @BuiltValueField(wireName: r'role')
  MessageObjectRoleEnum get role;
  // enum roleEnum {  user,  assistant,  };

  /// The content of the message in array of text and/or images.
  @BuiltValueField(wireName: r'content')
  BuiltList<MessageObjectContentInner> get content;

  /// If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
  @BuiltValueField(wireName: r'assistant_id')
  String? get assistantId;

  /// The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
  @BuiltValueField(wireName: r'run_id')
  String? get runId;

  /// A list of files attached to the message, and the tools they were added to.
  @BuiltValueField(wireName: r'attachments')
  BuiltList<CreateMessageRequestAttachmentsInner>? get attachments;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  MessageObject._();

  factory MessageObject([void updates(MessageObjectBuilder b)]) = _$MessageObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageObject> get serializer => _$MessageObjectSerializer();
}

class _$MessageObjectSerializer implements PrimitiveSerializer<MessageObject> {
  @override
  final Iterable<Type> types = const [MessageObject, _$MessageObject];

  @override
  final String wireName = r'MessageObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageObject object, {
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
      specifiedType: const FullType(MessageObjectObjectEnum),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'thread_id';
    yield serializers.serialize(
      object.threadId,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(MessageObjectStatusEnum),
    );
    yield r'incomplete_details';
    yield object.incompleteDetails == null ? null : serializers.serialize(
      object.incompleteDetails,
      specifiedType: const FullType.nullable(MessageObjectIncompleteDetails),
    );
    yield r'completed_at';
    yield object.completedAt == null ? null : serializers.serialize(
      object.completedAt,
      specifiedType: const FullType.nullable(int),
    );
    yield r'incomplete_at';
    yield object.incompleteAt == null ? null : serializers.serialize(
      object.incompleteAt,
      specifiedType: const FullType.nullable(int),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(MessageObjectRoleEnum),
    );
    yield r'content';
    yield serializers.serialize(
      object.content,
      specifiedType: const FullType(BuiltList, [FullType(MessageObjectContentInner)]),
    );
    yield r'assistant_id';
    yield object.assistantId == null ? null : serializers.serialize(
      object.assistantId,
      specifiedType: const FullType.nullable(String),
    );
    yield r'run_id';
    yield object.runId == null ? null : serializers.serialize(
      object.runId,
      specifiedType: const FullType.nullable(String),
    );
    yield r'attachments';
    yield object.attachments == null ? null : serializers.serialize(
      object.attachments,
      specifiedType: const FullType.nullable(BuiltList, [FullType(CreateMessageRequestAttachmentsInner)]),
    );
    yield r'metadata';
    yield object.metadata == null ? null : serializers.serialize(
      object.metadata,
      specifiedType: const FullType.nullable(JsonObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageObjectBuilder result,
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
            specifiedType: const FullType(MessageObjectObjectEnum),
          ) as MessageObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'thread_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.threadId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageObjectStatusEnum),
          ) as MessageObjectStatusEnum;
          result.status = valueDes;
          break;
        case r'incomplete_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MessageObjectIncompleteDetails),
          ) as MessageObjectIncompleteDetails?;
          if (valueDes == null) continue;
          result.incompleteDetails.replace(valueDes);
          break;
        case r'completed_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.completedAt = valueDes;
          break;
        case r'incomplete_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.incompleteAt = valueDes;
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageObjectRoleEnum),
          ) as MessageObjectRoleEnum;
          result.role = valueDes;
          break;
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MessageObjectContentInner)]),
          ) as BuiltList<MessageObjectContentInner>;
          result.content.replace(valueDes);
          break;
        case r'assistant_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.assistantId = valueDes;
          break;
        case r'run_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.runId = valueDes;
          break;
        case r'attachments':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CreateMessageRequestAttachmentsInner)]),
          ) as BuiltList<CreateMessageRequestAttachmentsInner>?;
          if (valueDes == null) continue;
          result.attachments.replace(valueDes);
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
  MessageObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageObjectBuilder();
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

class MessageObjectObjectEnum extends EnumClass {

  /// The object type, which is always `thread.message`.
  @BuiltValueEnumConst(wireName: r'thread.message')
  static const MessageObjectObjectEnum threadPeriodMessage = _$messageObjectObjectEnum_threadPeriodMessage;

  static Serializer<MessageObjectObjectEnum> get serializer => _$messageObjectObjectEnumSerializer;

  const MessageObjectObjectEnum._(String name): super(name);

  static BuiltSet<MessageObjectObjectEnum> get values => _$messageObjectObjectEnumValues;
  static MessageObjectObjectEnum valueOf(String name) => _$messageObjectObjectEnumValueOf(name);
}

class MessageObjectStatusEnum extends EnumClass {

  /// The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
  @BuiltValueEnumConst(wireName: r'in_progress')
  static const MessageObjectStatusEnum inProgress = _$messageObjectStatusEnum_inProgress;
  /// The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
  @BuiltValueEnumConst(wireName: r'incomplete')
  static const MessageObjectStatusEnum incomplete = _$messageObjectStatusEnum_incomplete;
  /// The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
  @BuiltValueEnumConst(wireName: r'completed')
  static const MessageObjectStatusEnum completed = _$messageObjectStatusEnum_completed;

  static Serializer<MessageObjectStatusEnum> get serializer => _$messageObjectStatusEnumSerializer;

  const MessageObjectStatusEnum._(String name): super(name);

  static BuiltSet<MessageObjectStatusEnum> get values => _$messageObjectStatusEnumValues;
  static MessageObjectStatusEnum valueOf(String name) => _$messageObjectStatusEnumValueOf(name);
}

class MessageObjectRoleEnum extends EnumClass {

  /// The entity that produced the message. One of `user` or `assistant`.
  @BuiltValueEnumConst(wireName: r'user')
  static const MessageObjectRoleEnum user = _$messageObjectRoleEnum_user;
  /// The entity that produced the message. One of `user` or `assistant`.
  @BuiltValueEnumConst(wireName: r'assistant')
  static const MessageObjectRoleEnum assistant = _$messageObjectRoleEnum_assistant;

  static Serializer<MessageObjectRoleEnum> get serializer => _$messageObjectRoleEnumSerializer;

  const MessageObjectRoleEnum._(String name): super(name);

  static BuiltSet<MessageObjectRoleEnum> get values => _$messageObjectRoleEnumValues;
  static MessageObjectRoleEnum valueOf(String name) => _$messageObjectRoleEnumValueOf(name);
}

