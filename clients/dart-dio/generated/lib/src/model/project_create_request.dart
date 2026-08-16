//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_create_request.g.dart';

/// ProjectCreateRequest
///
/// Properties:
/// * [name] - The friendly name of the project, this name appears in reports.
@BuiltValue()
abstract class ProjectCreateRequest implements Built<ProjectCreateRequest, ProjectCreateRequestBuilder> {
  /// The friendly name of the project, this name appears in reports.
  @BuiltValueField(wireName: r'name')
  String get name;

  ProjectCreateRequest._();

  factory ProjectCreateRequest([void updates(ProjectCreateRequestBuilder b)]) = _$ProjectCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectCreateRequest> get serializer => _$ProjectCreateRequestSerializer();
}

class _$ProjectCreateRequestSerializer implements PrimitiveSerializer<ProjectCreateRequest> {
  @override
  final Iterable<Type> types = const [ProjectCreateRequest, _$ProjectCreateRequest];

  @override
  final String wireName = r'ProjectCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectCreateRequest object, {
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
    ProjectCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectCreateRequestBuilder result,
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
  ProjectCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectCreateRequestBuilder();
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

