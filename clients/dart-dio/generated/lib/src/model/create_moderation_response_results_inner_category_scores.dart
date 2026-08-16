//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_response_results_inner_category_scores.g.dart';

/// A list of the categories along with their scores as predicted by model.
///
/// Properties:
/// * [hate] - The score for the category 'hate'.
/// * [hateSlashThreatening] - The score for the category 'hate/threatening'.
/// * [harassment] - The score for the category 'harassment'.
/// * [harassmentSlashThreatening] - The score for the category 'harassment/threatening'.
/// * [illicit] - The score for the category 'illicit'.
/// * [illicitSlashViolent] - The score for the category 'illicit/violent'.
/// * [selfHarm] - The score for the category 'self-harm'.
/// * [selfHarmSlashIntent] - The score for the category 'self-harm/intent'.
/// * [selfHarmSlashInstructions] - The score for the category 'self-harm/instructions'.
/// * [sexual] - The score for the category 'sexual'.
/// * [sexualSlashMinors] - The score for the category 'sexual/minors'.
/// * [violence] - The score for the category 'violence'.
/// * [violenceSlashGraphic] - The score for the category 'violence/graphic'.
@BuiltValue()
abstract class CreateModerationResponseResultsInnerCategoryScores implements Built<CreateModerationResponseResultsInnerCategoryScores, CreateModerationResponseResultsInnerCategoryScoresBuilder> {
  /// The score for the category 'hate'.
  @BuiltValueField(wireName: r'hate')
  num get hate;

  /// The score for the category 'hate/threatening'.
  @BuiltValueField(wireName: r'hate/threatening')
  num get hateSlashThreatening;

  /// The score for the category 'harassment'.
  @BuiltValueField(wireName: r'harassment')
  num get harassment;

  /// The score for the category 'harassment/threatening'.
  @BuiltValueField(wireName: r'harassment/threatening')
  num get harassmentSlashThreatening;

  /// The score for the category 'illicit'.
  @BuiltValueField(wireName: r'illicit')
  num get illicit;

  /// The score for the category 'illicit/violent'.
  @BuiltValueField(wireName: r'illicit/violent')
  num get illicitSlashViolent;

  /// The score for the category 'self-harm'.
  @BuiltValueField(wireName: r'self-harm')
  num get selfHarm;

  /// The score for the category 'self-harm/intent'.
  @BuiltValueField(wireName: r'self-harm/intent')
  num get selfHarmSlashIntent;

  /// The score for the category 'self-harm/instructions'.
  @BuiltValueField(wireName: r'self-harm/instructions')
  num get selfHarmSlashInstructions;

  /// The score for the category 'sexual'.
  @BuiltValueField(wireName: r'sexual')
  num get sexual;

  /// The score for the category 'sexual/minors'.
  @BuiltValueField(wireName: r'sexual/minors')
  num get sexualSlashMinors;

  /// The score for the category 'violence'.
  @BuiltValueField(wireName: r'violence')
  num get violence;

  /// The score for the category 'violence/graphic'.
  @BuiltValueField(wireName: r'violence/graphic')
  num get violenceSlashGraphic;

  CreateModerationResponseResultsInnerCategoryScores._();

  factory CreateModerationResponseResultsInnerCategoryScores([void updates(CreateModerationResponseResultsInnerCategoryScoresBuilder b)]) = _$CreateModerationResponseResultsInnerCategoryScores;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationResponseResultsInnerCategoryScoresBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationResponseResultsInnerCategoryScores> get serializer => _$CreateModerationResponseResultsInnerCategoryScoresSerializer();
}

class _$CreateModerationResponseResultsInnerCategoryScoresSerializer implements PrimitiveSerializer<CreateModerationResponseResultsInnerCategoryScores> {
  @override
  final Iterable<Type> types = const [CreateModerationResponseResultsInnerCategoryScores, _$CreateModerationResponseResultsInnerCategoryScores];

  @override
  final String wireName = r'CreateModerationResponseResultsInnerCategoryScores';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationResponseResultsInnerCategoryScores object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'hate';
    yield serializers.serialize(
      object.hate,
      specifiedType: const FullType(num),
    );
    yield r'hate/threatening';
    yield serializers.serialize(
      object.hateSlashThreatening,
      specifiedType: const FullType(num),
    );
    yield r'harassment';
    yield serializers.serialize(
      object.harassment,
      specifiedType: const FullType(num),
    );
    yield r'harassment/threatening';
    yield serializers.serialize(
      object.harassmentSlashThreatening,
      specifiedType: const FullType(num),
    );
    yield r'illicit';
    yield serializers.serialize(
      object.illicit,
      specifiedType: const FullType(num),
    );
    yield r'illicit/violent';
    yield serializers.serialize(
      object.illicitSlashViolent,
      specifiedType: const FullType(num),
    );
    yield r'self-harm';
    yield serializers.serialize(
      object.selfHarm,
      specifiedType: const FullType(num),
    );
    yield r'self-harm/intent';
    yield serializers.serialize(
      object.selfHarmSlashIntent,
      specifiedType: const FullType(num),
    );
    yield r'self-harm/instructions';
    yield serializers.serialize(
      object.selfHarmSlashInstructions,
      specifiedType: const FullType(num),
    );
    yield r'sexual';
    yield serializers.serialize(
      object.sexual,
      specifiedType: const FullType(num),
    );
    yield r'sexual/minors';
    yield serializers.serialize(
      object.sexualSlashMinors,
      specifiedType: const FullType(num),
    );
    yield r'violence';
    yield serializers.serialize(
      object.violence,
      specifiedType: const FullType(num),
    );
    yield r'violence/graphic';
    yield serializers.serialize(
      object.violenceSlashGraphic,
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationResponseResultsInnerCategoryScores object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationResponseResultsInnerCategoryScoresBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.hate = valueDes;
          break;
        case r'hate/threatening':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.hateSlashThreatening = valueDes;
          break;
        case r'harassment':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.harassment = valueDes;
          break;
        case r'harassment/threatening':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.harassmentSlashThreatening = valueDes;
          break;
        case r'illicit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.illicit = valueDes;
          break;
        case r'illicit/violent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.illicitSlashViolent = valueDes;
          break;
        case r'self-harm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.selfHarm = valueDes;
          break;
        case r'self-harm/intent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.selfHarmSlashIntent = valueDes;
          break;
        case r'self-harm/instructions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.selfHarmSlashInstructions = valueDes;
          break;
        case r'sexual':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.sexual = valueDes;
          break;
        case r'sexual/minors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.sexualSlashMinors = valueDes;
          break;
        case r'violence':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.violence = valueDes;
          break;
        case r'violence/graphic':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
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
  CreateModerationResponseResultsInnerCategoryScores deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationResponseResultsInnerCategoryScoresBuilder();
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

