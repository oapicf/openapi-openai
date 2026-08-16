//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_service_account_create_request.g.dart';

/// ProjectServiceAccountCreateRequest
///
/// Properties:
/// * [name] - The name of the service account being created.
@BuiltValue()
abstract class ProjectServiceAccountCreateRequest implements Built<ProjectServiceAccountCreateRequest, ProjectServiceAccountCreateRequestBuilder> {
  /// The name of the service account being created.
  @BuiltValueField(wireName: r'name')
  String get name;

  ProjectServiceAccountCreateRequest._();

  factory ProjectServiceAccountCreateRequest([void updates(ProjectServiceAccountCreateRequestBuilder b)]) = _$ProjectServiceAccountCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectServiceAccountCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectServiceAccountCreateRequest> get serializer => _$ProjectServiceAccountCreateRequestSerializer();
}

class _$ProjectServiceAccountCreateRequestSerializer implements PrimitiveSerializer<ProjectServiceAccountCreateRequest> {
  @override
  final Iterable<Type> types = const [ProjectServiceAccountCreateRequest, _$ProjectServiceAccountCreateRequest];

  @override
  final String wireName = r'ProjectServiceAccountCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectServiceAccountCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectServiceAccountCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectServiceAccountCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectServiceAccountCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectServiceAccountCreateRequestBuilder();
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

