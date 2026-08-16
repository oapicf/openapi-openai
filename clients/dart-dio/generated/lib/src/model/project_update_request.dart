//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_update_request.g.dart';

/// ProjectUpdateRequest
///
/// Properties:
/// * [name] - The updated name of the project, this name appears in reports.
@BuiltValue()
abstract class ProjectUpdateRequest implements Built<ProjectUpdateRequest, ProjectUpdateRequestBuilder> {
  /// The updated name of the project, this name appears in reports.
  @BuiltValueField(wireName: r'name')
  String get name;

  ProjectUpdateRequest._();

  factory ProjectUpdateRequest([void updates(ProjectUpdateRequestBuilder b)]) = _$ProjectUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectUpdateRequest> get serializer => _$ProjectUpdateRequestSerializer();
}

class _$ProjectUpdateRequestSerializer implements PrimitiveSerializer<ProjectUpdateRequest> {
  @override
  final Iterable<Type> types = const [ProjectUpdateRequest, _$ProjectUpdateRequest];

  @override
  final String wireName = r'ProjectUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectUpdateRequest object, {
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
    ProjectUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectUpdateRequestBuilder result,
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
  ProjectUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectUpdateRequestBuilder();
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

