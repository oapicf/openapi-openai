//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_moderation_response_results_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_response.g.dart';

/// Represents if a given text input is potentially harmful.
///
/// Properties:
/// * [id] - The unique identifier for the moderation request.
/// * [model] - The model used to generate the moderation results.
/// * [results] - A list of moderation objects.
@BuiltValue()
abstract class CreateModerationResponse implements Built<CreateModerationResponse, CreateModerationResponseBuilder> {
  /// The unique identifier for the moderation request.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The model used to generate the moderation results.
  @BuiltValueField(wireName: r'model')
  String get model;

  /// A list of moderation objects.
  @BuiltValueField(wireName: r'results')
  BuiltList<CreateModerationResponseResultsInner> get results;

  CreateModerationResponse._();

  factory CreateModerationResponse([void updates(CreateModerationResponseBuilder b)]) = _$CreateModerationResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationResponse> get serializer => _$CreateModerationResponseSerializer();
}

class _$CreateModerationResponseSerializer implements PrimitiveSerializer<CreateModerationResponse> {
  @override
  final Iterable<Type> types = const [CreateModerationResponse, _$CreateModerationResponse];

  @override
  final String wireName = r'CreateModerationResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(String),
    );
    yield r'results';
    yield serializers.serialize(
      object.results,
      specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationResponseBuilder result,
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
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.model = valueDes;
          break;
        case r'results':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateModerationResponseResultsInner)]),
          ) as BuiltList<CreateModerationResponseResultsInner>;
          result.results.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateModerationResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationResponseBuilder();
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

