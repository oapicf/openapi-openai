//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_moderation_response_results_inner_category_scores.dart';
import 'package:openapi/src/model/create_moderation_response_results_inner_categories.dart';
import 'package:openapi/src/model/create_moderation_response_results_inner_category_applied_input_types.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_response_results_inner.g.dart';

/// CreateModerationResponseResultsInner
///
/// Properties:
/// * [flagged] - Whether any of the below categories are flagged.
/// * [categories] 
/// * [categoryScores] 
/// * [categoryAppliedInputTypes] 
@BuiltValue()
abstract class CreateModerationResponseResultsInner implements Built<CreateModerationResponseResultsInner, CreateModerationResponseResultsInnerBuilder> {
  /// Whether any of the below categories are flagged.
  @BuiltValueField(wireName: r'flagged')
  bool get flagged;

  @BuiltValueField(wireName: r'categories')
  CreateModerationResponseResultsInnerCategories get categories;

  @BuiltValueField(wireName: r'category_scores')
  CreateModerationResponseResultsInnerCategoryScores get categoryScores;

  @BuiltValueField(wireName: r'category_applied_input_types')
  CreateModerationResponseResultsInnerCategoryAppliedInputTypes get categoryAppliedInputTypes;

  CreateModerationResponseResultsInner._();

  factory CreateModerationResponseResultsInner([void updates(CreateModerationResponseResultsInnerBuilder b)]) = _$CreateModerationResponseResultsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationResponseResultsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationResponseResultsInner> get serializer => _$CreateModerationResponseResultsInnerSerializer();
}

class _$CreateModerationResponseResultsInnerSerializer implements PrimitiveSerializer<CreateModerationResponseResultsInner> {
  @override
  final Iterable<Type> types = const [CreateModerationResponseResultsInner, _$CreateModerationResponseResultsInner];

  @override
  final String wireName = r'CreateModerationResponseResultsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationResponseResultsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'flagged';
    yield serializers.serialize(
      object.flagged,
      specifiedType: const FullType(bool),
    );
    yield r'categories';
    yield serializers.serialize(
      object.categories,
      specifiedType: const FullType(CreateModerationResponseResultsInnerCategories),
    );
    yield r'category_scores';
    yield serializers.serialize(
      object.categoryScores,
      specifiedType: const FullType(CreateModerationResponseResultsInnerCategoryScores),
    );
    yield r'category_applied_input_types';
    yield serializers.serialize(
      object.categoryAppliedInputTypes,
      specifiedType: const FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypes),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationResponseResultsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationResponseResultsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'flagged':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.flagged = valueDes;
          break;
        case r'categories':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateModerationResponseResultsInnerCategories),
          ) as CreateModerationResponseResultsInnerCategories;
          result.categories.replace(valueDes);
          break;
        case r'category_scores':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateModerationResponseResultsInnerCategoryScores),
          ) as CreateModerationResponseResultsInnerCategoryScores;
          result.categoryScores.replace(valueDes);
          break;
        case r'category_applied_input_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateModerationResponseResultsInnerCategoryAppliedInputTypes),
          ) as CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
          result.categoryAppliedInputTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateModerationResponseResultsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationResponseResultsInnerBuilder();
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

