package pokemon.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	
	private void updatePokedexInfo(int index)
	{
		//Update Basic Text fields
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		//Update Text areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}

	public PokemonPanel(PokemonController appController)
	{
		super();
		setBackground(new Color(220, 20, 60));
		this.appController = appController;
		
		appLayout = new SpringLayout();
				
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		nameField.setForeground(new Color(0, 0, 0));
		nameField.setBackground(new Color(255, 255, 255));
		numberField = new JTextField("##");
		numberField.setBackground(new Color(255, 255, 255));
		attackField = new JTextField("ap");
		attackField.setBackground(new Color(255, 255, 255));
		healthField = new JTextField("hp");
		healthField.setBackground(new Color(255, 255, 255));
		modifierField = new JTextField("mod");
		modifierField.setBackground(new Color(255, 255, 255));
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		healthLabel = new JLabel("health");
		modifierLabel = new JLabel("modifier");
		pokedexDropdown = new JComboBox();
		pokedexDropdown.setBackground(new Color(255, 255, 255));
		clearButton = new JButton("clear");
		clearButton.setBackground(new Color(255, 255, 255));
		saveButton = new JButton("save");
		saveButton.setBackground(new Color(255, 255, 255));
		descriptionArea = new JTextArea(5, 10);
		descriptionArea.setBackground(new Color(220, 20, 60));
		typeArea = new JTextArea(4, 15);
		typeArea.setBackground(new Color(220, 20, 60));
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		firstType.setBackground(Color.WHITE);
		secondType.setBackground(Color.WHITE);
		//Change this to match your 3 minimum Types in your pokedex
		if(types[0].equals("Grass"))
		{
			firstType.setBackground(Color.GREEN);
		}
		else if (types[0].equals("Ground"))
		{
			firstType.setBackground(Color.GRAY);
		}
		else if (types[0].equals("Psychic"))
		{
			firstType.setBackground(Color.PINK);
		}
		else if (types[0].equals("Water"))
		{
			firstType.setBackground(Color.BLUE);
		}
		
		if (types.length > 1)
		{
			if (types[1].equals("Psychic"))
			{
				secondType.setBackground(Color.PINK);
			}
			else if (types[1].equals("Grass"))
			{
				secondType.setBackground(Color.GREEN);
			}
			//...continue as above
			
		}
		
	}
	// Set this for each of the different type panels
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(iconLabel);
		this.add(nameLabel);
		this.add(evolvableLabel);
		this.add(numberLabel);
		this.add(attackLabel);
		this.add(healthLabel);
		this.add(modifierLabel);
		this.add(pokedexDropdown);
		this.add(clearButton);
		this.add(saveButton);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, clearButton);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, -1, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 59, SpringLayout.EAST, clearButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -6, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, clearButton);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 5, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 6, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 0, SpringLayout.NORTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 9, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 39, SpringLayout.SOUTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -6, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 6, SpringLayout.EAST, typeArea);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, 0, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, thirdType, 0, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, thirdType, 6, SpringLayout.EAST, typeArea);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 6, SpringLayout.EAST, typeArea);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, 0, SpringLayout.SOUTH, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 6, SpringLayout.EAST, typeArea);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 5, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -105, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, 0, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, -72, SpringLayout.WEST, numberField);
	}
	
	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(appController.isValidInteger(attackField.getText()) && appController.isValidInteger(healthField.getText())
						&& appController.isValidDouble(modifierField.getText()))
				{
					int selected = pokedexDropdown.getSelectedIndex();
					int health = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modifier = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolvable = evolvableBox.isSelected();
					
					//Send to the Controller to modify the Pokemon
					appController.updateSelected(selected, health, attack, evolvable, modifier, name);
				}
			}
		});
		
	}
	
}
