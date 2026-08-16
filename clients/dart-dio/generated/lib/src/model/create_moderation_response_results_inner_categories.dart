//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_response_results_inner_categories.g.dart';

/// A list of the categories, and whether they are flagged or not.
///
/// Properties:
/// * [hate] - Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
/// * [hateSlashThreatening] - Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
/// * [harassment] - Content that expresses, incites, or promotes harassing language towards any target.
/// * [harassmentSlashThreatening] - Harassment content that also includes violence or serious harm towards any target.
/// * [illicit] - Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
/// * [illicitSlashViolent] - Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
/// * [selfHarm] - Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
/// * [selfHarmSlashIntent] - Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
/// * [selfHarmSlashInstructions] - Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
/// * [sexual] - Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
/// * [sexualSlashMinors] - Sexual content that includes an individual who is under 18 years old.
/// * [violence] - Content that depicts death, violence, or physical injury.
/// * [violenceSlashGraphic] - Content that depicts death, violence, or physical injury in graphic detail.
@BuiltValue()
abstract class CreateModerationResponseResultsInnerCategories implements Built<CreateModerationResponseResultsInnerCategories, CreateModerationResponseResultsInnerCategoriesBuilder> {
  /// Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
  @BuiltValueField(wireName: r'hate')
  bool get hate;

  /// Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
  @BuiltValueField(wireName: r'hate/threatening')
  bool get hateSlashThreatening;

  /// Content that expresses, incites, or promotes harassing language towards any target.
  @BuiltValueField(wireName: r'harassment')
  bool get harassment;

  /// Harassment content that also includes violence or serious harm towards any target.
  @BuiltValueField(wireName: r'harassment/threatening')
  bool get harassmentSlashThreatening;

  /// Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
  @BuiltValueField(wireName: r'illicit')
  bool get illicit;

  /// Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
  @BuiltValueField(wireName: r'illicit/violent')
  bool get illicitSlashViolent;

  /// Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
  @BuiltValueField(wireName: r'self-harm')
  bool get selfHarm;

  /// Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
  @BuiltValueField(wireName: r'self-harm/intent')
  bool get selfHarmSlashIntent;

  /// Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
  @BuiltValueField(wireName: r'self-harm/instructions')
  bool get selfHarmSlashInstructions;

  /// Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
  @BuiltValueField(wireName: r'sexual')
  bool get sexual;

  /// Sexual content that includes an individual who is under 18 years old.
  @BuiltValueField(wireName: r'sexual/minors')
  bool get sexualSlashMinors;

  /// Content that depicts death, violence, or physical injury.
  @BuiltValueField(wireName: r'violence')
  bool get violence;

  /// Content that depicts death, violence, or physical injury in graphic detail.
  @BuiltValueField(wireName: r'violence/graphic')
  bool get violenceSlashGraphic;

  CreateModerationResponseResultsInnerCategories._();

  factory CreateModerationResponseResultsInnerCategories([void updates(CreateModerationResponseResultsInnerCategoriesBuilder b)]) = _$CreateModerationResponseResultsInnerCategories;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationResponseResultsInnerCategoriesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationResponseResultsInnerCategories> get serializer => _$CreateModerationResponseResultsInnerCategoriesSerializer();
}

class _$CreateModerationResponseResultsInnerCategoriesSerializer implements PrimitiveSerializer<CreateModerationResponseResultsInnerCategories> {
  @override
  final Iterable<Type> types = const [CreateModerationResponseResultsInnerCategories, _$CreateModerationResponseResultsInnerCategories];

  @override
  final String wireName = r'CreateModerationResponseResultsInnerCategories';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationResponseResultsInnerCategories object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'hate';
    yield serializers.serialize(
      object.hate,
      specifiedType: const FullType(bool),
    );
    yield r'hate/threatening';
    yield serializers.serialize(
      object.hateSlashThreatening,
      specifiedType: const FullType(bool),
    );
    yield r'harassment';
    yield serializers.serialize(
      object.harassment,
      specifiedType: const FullType(bool),
    );
    yield r'harassment/threatening';
    yield serializers.serialize(
      object.harassmentSlashThreatening,
      specifiedType: const FullType(bool),
    );
    yield r'illicit';
    yield serializers.serialize(
      object.illicit,
      specifiedType: const FullType(bool),
    );
    yield r'illicit/violent';
    yield serializers.serialize(
      object.illicitSlashViolent,
      specifiedType: const FullType(bool),
    );
    yield r'self-harm';
    yield serializers.serialize(
      object.selfHarm,
      specifiedType: const FullType(bool),
    );
    yield r'self-harm/intent';
    yield serializers.serialize(
      object.selfHarmSlashIntent,
      specifiedType: const FullType(bool),
    );
    yield r'self-harm/instructions';
    yield serializers.serialize(
      object.selfHarmSlashInstructions,
      specifiedType: const FullType(bool),
    );
    yield r'sexual';
    yield serializers.serialize(
      object.sexual,
      specifiedType: const FullType(bool),
    );
    yield r'sexual/minors';
    yield serializers.serialize(
      object.sexualSlashMinors,
      specifiedType: const FullType(bool),
    );
    yield r'violence';
    yield serializers.serialize(
      object.violence,
      specifiedType: const FullType(bool),
    );
    yield r'violence/graphic';
    yield serializers.serialize(
      object.violenceSlashGraphic,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationResponseResultsInnerCategories object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationResponseResultsInnerCategoriesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hate = valueDes;
          break;
        case r'hate/threatening':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hateSlashThreatening = valueDes;
          break;
        case r'harassment':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.harassment = valueDes;
          break;
        case r'harassment/threatening':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.harassmentSlashThreatening = valueDes;
          break;
        case r'illicit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.illicit = valueDes;
          break;
        case r'illicit/violent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.illicitSlashViolent = valueDes;
          break;
        case r'self-harm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.selfHarm = valueDes;
          break;
        case r'self-harm/intent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.selfHarmSlashIntent = valueDes;
          break;
        case r'self-harm/instructions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.selfHarmSlashInstructions = valueDes;
          break;
        case r'sexual':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.sexual = valueDes;
          break;
        case r'sexual/minors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.sexualSlashMinors = valueDes;
          break;
        case r'violence':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.violence = valueDes;
          break;
        case r'violence/graphic':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.violenceSlashGraphic = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateModerationResponseResultsInnerCategories deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationResponseResultsInnerCategoriesBuilder();
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

