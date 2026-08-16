//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_moderation_request_model.dart';
import 'package:openapi/src/model/create_moderation_request_input.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_request.g.dart';

/// CreateModerationRequest
///
/// Properties:
/// * [input] 
/// * [model] 
@BuiltValue()
abstract class CreateModerationRequest implements Built<CreateModerationRequest, CreateModerationRequestBuilder> {
  @BuiltValueField(wireName: r'input')
  CreateModerationRequestInput get input;

  @BuiltValueField(wireName: r'model')
  CreateModerationRequestModel? get model;

  CreateModerationRequest._();

  factory CreateModerationRequest([void updates(CreateModerationRequestBuilder b)]) = _$CreateModerationRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationRequest> get serializer => _$CreateModerationRequestSerializer();
}

class _$CreateModerationRequestSerializer implements PrimitiveSerializer<CreateModerationRequest> {
  @override
  final Iterable<Type> types = const [CreateModerationRequest, _$CreateModerationRequest];

  @override
  final String wireName = r'CreateModerationRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'input';
    yield serializers.serialize(
      object.input,
      specifiedType: const FullType(CreateModerationRequestInput),
    );
    if (object.model != null) {
      yield r'model';
      yield serializers.serialize(
        object.model,
        specifiedType: const FullType(CreateModerationRequestModel),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'input':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateModerationRequestInput),
          ) as CreateModerationRequestInput;
          result.input.replace(valueDes);
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateModerationRequestModel),
          ) as CreateModerationRequestModel;
          result.model.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateModerationRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationRequestBuilder();
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

